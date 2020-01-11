package com.uz.clinic.domain.repository;

import com.uz.clinic.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
