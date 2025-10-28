package com.obectron.api.person;

import com.obectron.api.BaseMapper;
import com.obectron.core.person.Person;
import com.obectron.persistence.person.PersonEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonMapper implements BaseMapper<Person, PersonEntity, PersonDTO> {

    @Override
    public Optional<Person> mapDtoToModel(@NonNull PersonDTO personDTO) {
        return Optional.of(Person.builder()
                            .id(personDTO.getId())
                            .type(personDTO.getType())
                            .name(personDTO.getName())
                            .patronym(personDTO.getPatronym())
                            .surname(personDTO.getSurname())
                            .maidenName(personDTO.getMaidenName())
                            .nicknames(personDTO.getNicknames())
                            .addresses(personDTO.getAddresses())
                            .gender(personDTO.getGender())
                            .birthDate(personDTO.getBirthDate())
                            .phone(personDTO.getPhone())
                            .email(personDTO.getEmail())
                            .build());
    }

    @Override
    public Optional<PersonDTO> mapModelToDto(@NonNull Person person) {
        return Optional.of(PersonDTO.builder()
                            .id(person.getId())
                            .type(person.getType())
                            .name(person.getName())
                            .patronym(person.getPatronym())
                            .surname(person.getSurname())
                            .maidenName(person.getMaidenName())
                            .nicknames(person.getNicknames())
                            .addresses(person.getAddresses())
                            .gender(person.getGender())
                            .birthDate(person.getBirthDate())
                            .phone(person.getPhone())
                            .email(person.getEmail())
                            .build());
    }

    @Override
    public Optional<PersonEntity> mapDtoToEntity(@NonNull PersonDTO personDTO) {
        return Optional.of(PersonEntity.builder()
                            .id(personDTO.getId())
                            .type(personDTO.getType())
                            .name(personDTO.getName())
                            .patronym(personDTO.getPatronym())
                            .surname(personDTO.getSurname())
                            .maidenName(personDTO.getMaidenName())
                            .nicknames(personDTO.getNicknames())
                            .addresses(personDTO.getAddresses())
                            .gender(personDTO.getGender())
                            .birthDate(personDTO.getBirthDate())
                            .phone(personDTO.getPhone())
                            .email(personDTO.getEmail())
                            .build());
    }

    @Override
    public Optional<PersonDTO> mapEntityToDto(@NonNull PersonEntity personEntity) {
        return Optional.of(PersonDTO.builder()
                            .id(personEntity.getId())
                            .type(personEntity.getType())
                            .name(personEntity.getName())
                            .patronym(personEntity.getPatronym())
                            .surname(personEntity.getSurname())
                            .maidenName(personEntity.getMaidenName())
                            .nicknames(personEntity.getNicknames())
                            .addresses(personEntity.getAddresses())
                            .gender(personEntity.getGender())
                            .birthDate(personEntity.getBirthDate())
                            .phone(personEntity.getPhone())
                            .email(personEntity.getEmail())
                            .build());
    }

    @Override
    public List<Person> mapDtosToModels(@NonNull List<PersonDTO> dtos) {
        return dtos.stream()
                   .map(this::mapDtoToModel)
                   .filter(Optional::isPresent)
                   .map(Optional::get)
                   .toList();
    }

    @Override
    public List<PersonDTO> mapModelsToDtos(@NonNull List<Person> models) {
        return models.stream()
                     .map(this::mapModelToDto)
                     .filter(Optional::isPresent)
                     .map(Optional::get)
                     .toList();
    }

    @Override
    public List<PersonEntity> mapDtosToEntities(@NonNull List<PersonDTO> dtos) {
        return dtos.stream()
                   .map(this::mapDtoToEntity)
                   .filter(Optional::isPresent)
                   .map(Optional::get)
                   .toList();
    }

    @Override
    public List<PersonDTO> mapEntitiesToDtos(@NonNull List<PersonEntity> entities) {
        return entities.stream()
                       .map(this::mapEntityToDto)
                       .filter(Optional::isPresent)
                       .map(Optional::get)
                       .toList();
    }
}
