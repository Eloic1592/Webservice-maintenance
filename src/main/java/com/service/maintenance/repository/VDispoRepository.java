package com.service.maintenance.repository;

import com.service.maintenance.model.VDispo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VDispoRepository extends JpaRepository<VDispo, Integer> {

    List<VDispo> findAllByEtat(Integer etat);
}