package com.service.maintenance.repository;

import com.service.maintenance.model.VPlainteInd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VPlainteIndRepository extends JpaRepository<VPlainteInd, Integer> {
    List<VPlainteInd> findAllByEtat(Integer etat);

    List<VPlainteInd> findAllByIdutilisateur(Integer iduser);

    VPlainteInd findVPlainteIndByIdplainte(Integer idplainte);
}