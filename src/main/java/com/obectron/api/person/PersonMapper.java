package com.obectron.api.person;

import com.obectron.api.BaseMapper;
import com.obectron.core.person.Person;
import com.obectron.persistence.person.PersonEntity;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

public interface PersonMapper extends BaseMapper<Person, PersonEntity, PersonDTO> {
    Optional<Person> mapDtoToModel(@NotNull PersonDTO dto);
    Optional<PersonDTO> mapModelToDto(@NotNull Person model);
    Optional<PersonEntity> mapDtoToEntity(@NotNull PersonDTO dto);
    Optional<PersonDTO> mapEntityToDto(@NotNull PersonEntity entity);
    List<Person> mapDtosToModels(@NotNull List<PersonDTO> dtos);
    List<PersonDTO> mapModelsToDtos(@NotNull List<Person> models);
    List<PersonEntity> mapDtosToEntities(@NotNull List<PersonDTO> dtos);
    List<PersonDTO> mapEntitiesToDtos(@NotNull List<PersonEntity> entities);
}
