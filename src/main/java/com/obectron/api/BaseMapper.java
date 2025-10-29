package com.obectron.api;

import com.obectron.core.Model;
import com.obectron.db.BaseEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BaseMapper<M extends Model, E extends BaseEntity, D extends DTO> {
    Optional<M> mapDtoToModel(@NotNull D dto);

    Optional<D> mapModelToDto(@NotNull M model);
    Optional<E> mapDtoToEntity(@NotNull D dto);
    Optional<D> mapEntityToDto(@NotNull E entity);

    List<M> mapDtosToModels(@NotNull List<D> dtos);

    List<D> mapModelsToDtos(@NotNull List<M> models);
    List<E> mapDtosToEntities(@NotNull List<D> dtos);
    List<D> mapEntitiesToDtos(@NotNull List<E> entities);

}
