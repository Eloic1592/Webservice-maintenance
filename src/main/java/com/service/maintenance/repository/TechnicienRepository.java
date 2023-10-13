package com.service.maintenance.repository;

import com.service.maintenance.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnicienRepository extends JpaRepository<Technicien, Integer> {
    List<Technicien> findAllByEtat(Integer etat);
}