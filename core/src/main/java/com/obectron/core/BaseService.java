package com.obectron.core;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface BaseService<E extends BaseEntity> {

    Page<E> getAll(Pageable pageable);

    Optional<E> getByID(UUID id);

    E save(E entity);

    List<E> saveAll(List<E> entities);

    void deleteByID(UUID id);

    void deleteAll(List<UUID> entities);

    boolean existsById(UUID id);
}
