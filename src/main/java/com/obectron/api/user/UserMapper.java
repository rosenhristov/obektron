package com.obectron.api.user;

import com.obectron.api.BaseMapper;
import com.obectron.core.user.User;

import com.obectron.persistence.user.UserEntity;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

public interface UserMapper extends BaseMapper<User, UserEntity, UserDTO> {
    Optional<User> mapDtoToModel(@NotNull UserDTO userDTO);
    Optional<UserDTO> mapModelToDto(@NotNull User user);
    Optional<UserEntity> mapDtoToEntity(@NotNull UserDTO dto);
    Optional<UserDTO> mapEntityToDto(@NotNull UserEntity entity);
    List<User> mapDtosToModels(@NotNull List<UserDTO> dtos);
    List<UserDTO> mapModelsToDtos(@NotNull List<User> models);
    List<UserEntity> mapDtosToEntities(@NotNull List<UserDTO> dtos);
    List<UserDTO> mapEntitiesToDtos(@NotNull List<UserEntity> entities);
}
