package com.obektron.application.address;

import com.obektron.core.address.AddressDAO;
import com.obektron.core.address.AddressService;
import com.obektron.persistence.address.AddressEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AddressServiceImpl implements AddressService {

    private final AddressDAO addressRepository;

    public AddressServiceImpl(AddressDAO addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Page<AddressEntity> getAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    @Override
    public Optional<AddressEntity> getByID(UUID id) {
        return addressRepository.findById(id);
    }

    @Override
    public AddressEntity save(AddressEntity entity) {
        return addressRepository.save(entity);
    }

    @Override
    public List<AddressEntity> saveAll(List<AddressEntity> entities) {
        return addressRepository.saveAll(entities);
    }

    @Override
    public void deleteByID(UUID id) {
        addressRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<UUID> ids) {
        addressRepository.deleteAllById(ids);
    }

    @Override
    public boolean existsById(UUID id) {
        return addressRepository.existsById(id);
    }
}
