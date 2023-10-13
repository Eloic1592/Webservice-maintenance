package com.service.maintenance.repository;

import com.service.maintenance.model.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntretienRepository extends JpaRepository<Entretien, Integer> {
    List<Entretien> findAllByEtat(Integer etat);
}