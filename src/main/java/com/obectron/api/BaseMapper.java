package com.obectron.api;

import com.obectron.core.Model;
import com.obectron.persistence.BaseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BaseMapper<M extends Model, E extends BaseEntity, D extends DTO> {
    Optional<M> mapDtoToModel(@NonNull  D dto);

    Optional<D> mapModelToDto(@NonNull M model);
    Optional<E> mapDtoToEntity(@NonNull D dto);
    Optional<D> mapEntityToDto(@NonNull E entity);

    List<M> mapDtosToModels(@NonNull List<D> dtos);

    List<D> mapModelsToDtos(@NonNull List<M> models);
    List<E> mapDtosToEntities(@NonNull List<D> dtos);
    List<D> mapEntitiesToDtos(@NonNull List<E> entities);

}
