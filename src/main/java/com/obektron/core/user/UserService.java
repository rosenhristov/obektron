package com.obektron.core.user;

import com.obektron.core.BaseService;
import com.obektron.persistence.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService extends BaseService<UserEntity> {
    Page<UserEntity> getAll(Pageable pageable);

    Optional<UserEntity> getByID(UUID id);

    UserEntity save(UserEntity userEntity);
    List<UserEntity> saveAll(List<UserEntity> entities);

    void delete(UserEntity userEntity);

    void deleteByID(UUID id);

    void deleteAll(List<UUID> entities);

    boolean existsById(UUID id);
}
