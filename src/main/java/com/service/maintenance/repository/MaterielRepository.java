package com.service.maintenance.repository;

import com.service.maintenance.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MaterielRepository extends JpaRepository<Materiel, Integer> {
    List<Materiel> findAllByEtat(Integer etat);
}
