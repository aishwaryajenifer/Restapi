package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.Grocery;

@Repository
public interface GroceryRepo extends JpaRepository<Grocery,Long> {
    
}
