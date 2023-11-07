package com.service.maintenance.repository;

import com.service.maintenance.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Integer> {
    List<Salle> findAllByEtat(Integer etat);

    Salle findSalleById(Integer id);
}