package com.example.msarabbitproducer.repository;

import com.example.msarabbitproducer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
