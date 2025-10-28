package com.obektron.core.person;

import com.obektron.core.BaseService;
import com.obektron.persistence.person.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService extends BaseService<PersonEntity> {

    Page<PersonEntity> getAll(Pageable pageable);
    Optional<PersonEntity> getByID(UUID id);

    PersonEntity save(PersonEntity userEntity);
    List<PersonEntity> saveAll(List<PersonEntity> entities);

    void delete (PersonEntity userEntity);

    void deleteAll(List<UUID> ids);

    boolean existsById(UUID id);
}
