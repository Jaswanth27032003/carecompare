package com.carecompare.repository;

import com.carecompare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email); // Ensure this exists
    User findByPolicyNumber(String policyNumber);
}