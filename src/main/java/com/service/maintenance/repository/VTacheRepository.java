package com.service.maintenance.repository;

import com.service.maintenance.model.VTache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VTacheRepository extends JpaRepository<VTache, Integer> {

    List<VTache> findAllByEtat(Integer etat);
}