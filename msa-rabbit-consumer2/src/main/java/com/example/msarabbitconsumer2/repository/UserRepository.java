package com.example.msarabbitconsumer2.repository;

import com.example.msarabbitconsumer2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}