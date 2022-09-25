package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}
