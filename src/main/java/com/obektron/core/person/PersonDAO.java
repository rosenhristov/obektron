package com.obektron.core.person;

import com.obektron.core.DAO;
import com.obektron.persistence.person.PersonEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonDAO extends DAO<PersonEntity, UUID> {
    default boolean existsByEmail(String email) {
        return findAll().stream()
                .anyMatch(person -> person.getEmail().equals(email));
    }
}
