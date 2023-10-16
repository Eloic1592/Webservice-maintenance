package com.service.maintenance.repository;

import com.service.maintenance.model.TachePrioritaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TachePrioritaireRepository extends JpaRepository<TachePrioritaire, Integer> {

    List<TachePrioritaire> findAllByEtat(Integer etat);
}