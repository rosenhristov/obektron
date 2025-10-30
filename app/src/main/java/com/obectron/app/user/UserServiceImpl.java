package com.obectron.app.user;

import com.obectron.core.user.UserService;
import com.obectron.core.user.UserEntity;
import com.obectron.db.user.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Page<UserEntity> getAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Optional<UserEntity> getByID(UUID id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> saveAll(List<UserEntity> entities) {
        return userRepository.saveAll(entities);
    }

    @Override
    public void delete(UserEntity userEntity) {
        userRepository.delete(userEntity);
    }

    @Override
    public void deleteByID(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<UUID> entities) {
        userRepository.deleteAllById(entities);
    }

    @Override
    public boolean existsById(UUID id) {
        return userRepository.existsById(id);
    }


}
