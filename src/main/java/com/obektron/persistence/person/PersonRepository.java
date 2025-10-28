package com.obektron.persistence.person;

import com.obektron.core.person.PersonDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PersonDAO {

    @Override
    default boolean existsByEmail(String email) {
        return findAll().stream().anyMatch(person -> person.getEmail().equals(email));
    }
}
