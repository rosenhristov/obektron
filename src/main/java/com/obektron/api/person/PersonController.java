package com.obektron.api.person;

import com.obektron.api.ObectronApi;
import com.obektron.core.person.PersonService;
import com.obektron.persistence.person.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/people")
public class PersonController implements ObectronApi<PersonDTO> {

    private final PersonService personService;
    private final PersonMapper personMapper;

    public PersonController(PersonService personService, PersonMapper personMapper) {
        this.personService = personService;
        this.personMapper = personMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getByID(@PathVariable("id") UUID id) {
        Optional<PersonDTO> dto = personService.getByID(id).flatMap(personMapper::mapEntityToDto);
        return dto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    @GetMapping
    public ResponseEntity<Page<PersonDTO>> getAll(Pageable pageable) {
        Page<PersonEntity> page = personService.getAll(pageable);
        Page<PersonDTO> dtoPage = page.map(entity -> personMapper.mapEntityToDto(entity).get());
        return ResponseEntity.ok(dtoPage);
    }

    @Override
    @PostMapping
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO dto) {
        Optional<PersonEntity> personEntity = personMapper.mapDtoToEntity(dto);
        if (personEntity.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        PersonEntity savedPerson = personService.save(personEntity.get());

        return personMapper.mapEntityToDto(savedPerson)
                .map(userDTO -> ResponseEntity.created(URI.create("/people/" + userDTO.getId())).body(userDTO))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }

    @Override
    @PostMapping("/batch")
    public ResponseEntity<List<PersonDTO>> saveAll(@RequestBody @Valid List<PersonDTO> entities) {
        return ResponseEntity.status(HttpStatus.CREATED).body(entities);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") UUID id) {
        if (personService.existsById(id)) {
            personService.deleteByID(id);
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
        personService.deleteAll(ids);
        return ResponseEntity.noContent().build();
    }
}
