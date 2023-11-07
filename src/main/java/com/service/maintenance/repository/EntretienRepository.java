package com.service.maintenance.repository;

import com.service.maintenance.model.Entretien;
import com.service.maintenance.model.TypeEntretien;
import com.service.maintenance.model.VEntretien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntretienRepository extends JpaRepository<Entretien, Integer> {
    List<Entretien> findAllByEtat(Integer etat);

    Entretien findEntretienById(Integer id);
}