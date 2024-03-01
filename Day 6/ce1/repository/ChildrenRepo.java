package com.example.day6_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6_1.model.Children;

@Repository
public interface ChildrenRepo extends JpaRepository<Children,Integer>{

    
}
