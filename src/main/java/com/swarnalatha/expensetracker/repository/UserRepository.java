package com.swarnalatha.expensetracker.repository;

import com.swarnalatha.expensetracker.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom queries here if needed
    User findByEmail(String email); // Optional: for login/check
}