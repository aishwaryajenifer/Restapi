package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration,Long> {
    
}
