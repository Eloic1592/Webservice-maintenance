package com.service.maintenance.repository;

import com.service.maintenance.model.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueRepository extends JpaRepository<Historique, Integer> {
    
}