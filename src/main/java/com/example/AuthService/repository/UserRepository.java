package com.example.AuthService.repository;

import com.example.AuthService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    List<User> findAll();
    User save(User user);

    Optional<User> findByUsername(String username);
}
