package com.service.maintenance.repository;

import com.service.maintenance.model.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisponibiliteRepository extends JpaRepository<Disponibilite, Integer> {
     List<Disponibilite> findAllByEtat(Integer etat);

     List<Disponibilite> findAllByIdtechnicienAndEtat(Integer idtech,Integer etat);
}