package com.obectron.api.user;

import com.obectron.core.user.User;
import com.obectron.persistence.user.UserEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Optional<User> mapDtoToModel(@NotNull UserDTO userDTO) {
        return Optional.of(User.builder()
                            .id(userDTO.getId())
                            .role(userDTO.getRole())
                            .name(userDTO.getName())
                            .patronym(userDTO.getPatronym())
                            .surname(userDTO.getSurname())
                            .addresses(userDTO.getAddresses())
                            .gender(userDTO.getGender())
                            .birthDate(userDTO.getBirthDate())
                            .phone(userDTO.getPhone())
                            .email(userDTO.getEmail())
                            .username(userDTO.getUsername())
                            .password(userDTO.getPassword())
                            .build());
    }


    @Override
    public Optional<UserDTO> mapModelToDto(@NotNull User user) {
        return Optional.of(UserDTO.builder()
                            .id(user.getId())
                            .role(user.getRole())
                            .name(user.getName())
                            .patronym(user.getPatronym())
                            .surname(user.getSurname())
                            .addresses(user.getAddresses())
                            .gender(user.getGender())
                            .birthDate(user.getBirthDate())
                            .phone(user.getPhone())
                            .email(user.getEmail())
                            .username(user.getUsername())
                            .password(user.getPassword())
                            .build());
            }

    @Override
    public Optional<UserEntity> mapDtoToEntity(@NotNull UserDTO userDTO) {
        return Optional.of(UserEntity.builder()
                                .id(userDTO.getId())
                                .role(userDTO.getRole())
                                .name(userDTO.getName())
                                .patronym(userDTO.getPatronym())
                                .surname(userDTO.getSurname())
                                .addresses(userDTO.getAddresses())
                                .gender(userDTO.getGender())
                                .birthDate(userDTO.getBirthDate())
                                .phone(userDTO.getPhone())
                                .email(userDTO.getEmail())
                                .username(userDTO.getUsername())
                                .password(userDTO.getPassword())
                                .build());
    }

    @Override
    public Optional<UserDTO> mapEntityToDto(@NotNull UserEntity userEntity) {
        return Optional.of(UserDTO.builder()
                                .id(userEntity.getId())
                                .role(userEntity.getRole())
                                .name(userEntity.getName())
                                .patronym(userEntity.getPatronym())
                                .surname(userEntity.getSurname())
                                .addresses(userEntity.getAddresses())
                                .gender(userEntity.getGender())
                                .birthDate(userEntity.getBirthDate())
                                .phone(userEntity.getPhone())
                                .email(userEntity.getEmail())
                                .username(userEntity.getUsername())
                                .password(userEntity.getPassword())
                                .build());
    }

    @Override
    public List<User> mapDtosToModels(@NotNull List<UserDTO> dtos) {
        return dtos.stream()
                   .map(this::mapDtoToModel)
                   .filter(Optional::isPresent)
                   .map(Optional::get)
                   .toList();
    }

    @Override
    public List<UserDTO> mapModelsToDtos(@NotNull List<User> users) {
        return users.stream()
                    .map(this::mapModelToDto)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .toList();
    }

    @Override
    public List<UserEntity> mapDtosToEntities(@NotNull List<UserDTO> dtos) {
        return dtos.stream()
                   .map(this::mapDtoToEntity)
                   .filter(Optional::isPresent)
                   .map(Optional::get)
                   .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> mapEntitiesToDtos(@NotNull List<UserEntity> entities) {
        return entities.stream()
                       .map(this::mapEntityToDto)
                       .filter(Optional::isPresent)
                       .map(Optional::get)
                       .collect(Collectors.toList());
    }
}
