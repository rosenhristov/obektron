package com.obectron.persistence.address;

import com.obectron.core.address.AddressDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends AddressDAO {

}
