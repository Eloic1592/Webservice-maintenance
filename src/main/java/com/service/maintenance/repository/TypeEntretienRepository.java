package com.service.maintenance.repository;

import com.service.maintenance.model.TypeEntretien;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



public interface TypeEntretienRepository extends JpaRepository<TypeEntretien, Integer> {

    List<TypeEntretien> findAllByEtat(Integer etat);
}