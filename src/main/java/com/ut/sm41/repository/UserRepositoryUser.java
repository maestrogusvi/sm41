package com.ut.sm41.repository;

import com.ut.sm41.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoryUser extends JpaRepository<User, Integer > {
    Optional<User> findByName(String username);
}
