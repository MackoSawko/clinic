package com.uz.clinic.domain.repository;

import com.uz.clinic.domain.User;
import com.uz.clinic.domain.Visit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
}
