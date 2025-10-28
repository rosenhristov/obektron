package com.obektron.core.address;

import com.obektron.core.DAO;
import com.obektron.persistence.address.AddressEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressDAO extends DAO<AddressEntity, UUID> {

}
