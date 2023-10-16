package com.service.maintenance.repository;

import com.service.maintenance.model.Plainte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlainteRepository extends JpaRepository<Plainte, Integer> {
    List<Plainte> findAllByEtat(Integer etat);
}