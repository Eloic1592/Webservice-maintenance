package com.service.maintenance.repository;

import com.service.maintenance.model.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterventionRepository extends JpaRepository<Intervention, Integer> {

    List<Intervention> findAllByEtat(Integer etat);

}