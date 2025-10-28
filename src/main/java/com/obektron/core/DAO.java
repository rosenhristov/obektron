package com.obektron.core;

import com.obektron.persistence.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAO<E extends BaseEntity, ID> extends JpaRepository<E, ID> {

}
