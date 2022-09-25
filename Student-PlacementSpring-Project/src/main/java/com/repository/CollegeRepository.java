package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.College;

@Repository

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
