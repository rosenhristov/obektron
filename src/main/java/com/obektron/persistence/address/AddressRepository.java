package com.obektron.persistence.address;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressEntity, UUID> {



}
