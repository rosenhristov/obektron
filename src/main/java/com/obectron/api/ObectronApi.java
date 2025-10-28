package com.obectron.api;

import com.obectron.api.person.PersonDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ObectronApi<D extends DTO> {
    ResponseEntity<D> getByID(UUID id);

    ResponseEntity<Page<D>> getAll(Pageable pageable);

    ResponseEntity<D> save(D dto);
    ResponseEntity<List<D>> saveAll(List<D> entities);
    ResponseEntity<Void> delete(UUID id);

    ResponseEntity<Void> deleteAll(List<UUID> entities);
}
