package com.service.maintenance.repository;

import com.service.maintenance.model.TacheAcheve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheAcheveRepository extends JpaRepository<TacheAcheve, Integer> {
    List<TacheAcheve> findAllByEtat(Integer etat);
}