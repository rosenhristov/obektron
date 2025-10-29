package com.obectron.app.person;

import com.obectron.core.person.PersonDAO;
import com.obectron.core.person.PersonService;
import com.obectron.db.person.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDAO personRepository;

    public PersonServiceImpl(PersonDAO personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page<PersonEntity> getAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    @Override
    public Optional<PersonEntity> getByID(UUID id) {
        return personRepository.findById(id);
    }

    @Override
    public PersonEntity save(PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }

    @Override
    public List<PersonEntity> saveAll(List<PersonEntity> entities) {
        return personRepository.saveAll(entities);
    }

    @Override
    public void delete(PersonEntity personEntity) {
        personRepository.delete(personEntity);
    }



    @Override
    public void deleteByID(UUID id) {
        personRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<UUID> ids) {
        personRepository.deleteAllById(ids);
    }

    @Override
    public boolean existsById(UUID id) {
        return personRepository.existsById(id);
    }
}
