package com.service.maintenance.repository;

import com.service.maintenance.model.Plainte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlainteRepository extends JpaRepository<Plainte, Integer> {
}