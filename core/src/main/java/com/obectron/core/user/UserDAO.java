package com.obectron.core.user;

import com.obectron.core.DAO;

import java.util.UUID;

public interface UserDAO extends DAO<UserEntity, UUID> {
    default boolean existsByUsername(String username) {
        return findAll().stream().anyMatch(user -> user.getUsername().equals(username));
    }
    default boolean existsByEmail(String email) {
        return findAll().stream().anyMatch(user -> user.getEmail().equals(email));
    }
}
