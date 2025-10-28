package com.obectron.core;

import com.obectron.persistence.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAO<E extends BaseEntity, ID> extends JpaRepository<E, ID> {

}
