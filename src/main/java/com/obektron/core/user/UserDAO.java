package com.obektron.core.user;

import com.obektron.core.DAO;
import com.obektron.persistence.user.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserDAO extends DAO<UserEntity, UUID> {
    default boolean existsByUsername(String username) {
        return findAll().stream().anyMatch(user -> user.getUsername().equals(username));
    }
    default boolean existsByEmail(String email) {
        return findAll().stream().anyMatch(user -> user.getEmail().equals(email));
    }
}
