package com.obectron.core.person;

import com.obectron.core.DAO;
import com.obectron.db.person.PersonEntity;
import java.util.UUID;
public interface PersonDAO extends DAO<PersonEntity, UUID> {
    default boolean existsByEmail(String email) {
        return findAll().stream()
                .anyMatch(person -> person.getEmail().equals(email));
    }
}
