package com.obectron.core.address;

import com.obectron.core.DAO;
import com.obectron.persistence.address.AddressEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressDAO extends DAO<AddressEntity, UUID> {

}
