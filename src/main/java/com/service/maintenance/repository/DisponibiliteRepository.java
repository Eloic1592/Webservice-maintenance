package com.service.maintenance.repository;

import com.service.maintenance.model.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisponibiliteRepository extends JpaRepository<Disponibilite, Integer> {
    
}