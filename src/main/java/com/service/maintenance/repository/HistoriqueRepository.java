package com.service.maintenance.repository;

import com.service.maintenance.model.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriqueRepository extends JpaRepository<Historique, Integer> {

    List<Historique> findAllByEtat(Integer etat);
}