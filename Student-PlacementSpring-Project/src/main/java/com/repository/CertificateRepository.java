package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Certificate;

@Repository

public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

}
