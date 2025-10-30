package com.obectron.api.user;

import com.obectron.api.ObectronApi;
import com.obectron.core.user.UserService;
import com.obectron.core.user.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController implements ObectronApi<UserDTO> {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userMapper = userMapper;
        this.userService = userService;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getByID(@PathVariable("id") UUID id) {
        Optional<UserDTO> dto = userService.getByID(id).flatMap(userMapper::mapEntityToDto);
        return dto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    @GetMapping
    public ResponseEntity<Page<UserDTO>> getAll(Pageable pageable) {
        Page<UserEntity> page = userService.getAll(pageable);
        Page<UserDTO> dtoPage = page.map(entity -> userMapper.mapEntityToDto(entity).get());
        return ResponseEntity.ok(dtoPage);
    }

    @Override
    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO dto) {
        Optional<UserEntity> userToSave = userMapper.mapDtoToEntity(dto);
        if (userToSave.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        UserEntity savedUser = userService.save(userToSave.get());

        return userMapper.mapEntityToDto(savedUser)
                .map(userDTO -> ResponseEntity.created(URI.create("/users/" + userDTO.getId())).body(userDTO))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }

    @Override
    @PostMapping("/batch")
    public ResponseEntity<List<UserDTO>> saveAll(@RequestBody List<UserDTO> dtos) {
        List<UserEntity> entities = userMapper.mapDtosToEntities(dtos);
        Map<UUID, UserEntity> savedEntities = userService.saveAll(entities).stream()
                .collect(Collectors.toMap(UserEntity::getId, Function.identity()));
        List<UserDTO> saved = dtos.stream()
                   .filter(dto -> nonNull(savedEntities.get(dto.getId())))
                   .toList();
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        if (userService.existsById(id)) {
            userService.deleteByID(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    @DeleteMapping("/batch")
    public ResponseEntity<Void> deleteAll(@RequestBody @Valid List<UUID> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return ResponseEntity.badRequest().build();
        }
        userService.deleteAll(ids);
        return ResponseEntity.noContent().build();
    }
}
