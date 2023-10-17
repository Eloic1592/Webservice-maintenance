package com.service.maintenance.repository;

import com.service.maintenance.model.VEntretien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VEntretienRepository extends JpaRepository<VEntretien, Integer> {
    List<VEntretien> findAllByEtat(Integer etat);
}