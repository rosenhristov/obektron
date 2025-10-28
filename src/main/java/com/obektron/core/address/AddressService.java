package com.obektron.core.address;

import com.obektron.core.BaseService;
import com.obektron.persistence.address.AddressEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface AddressService extends BaseService<AddressEntity> {

    Page<AddressEntity> getAll(Pageable pageable);

    Optional<AddressEntity> getByID(UUID id);

    AddressEntity save(AddressEntity entity);

    List<AddressEntity> saveAll(List<AddressEntity> entities);

    void deleteByID(UUID id);

    void deleteAll(List<UUID> ids);

    boolean existsById(UUID id);
}
