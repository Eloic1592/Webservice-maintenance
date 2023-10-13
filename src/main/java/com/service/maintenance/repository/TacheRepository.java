package com.service.maintenance.repository;

import com.service.maintenance.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache, Integer> {
    List<Tache> findAllByEtat(Integer etat);

    List<Tache> findAllByIdtechnicien(Integer idtechnicien);

    List<Tache> findAllByIdplainte(Integer idplainte);


}