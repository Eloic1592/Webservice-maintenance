package com.service.maintenance.repository;

import com.service.maintenance.model.VPlainteSalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VPlainteSalleRepository extends JpaRepository<VPlainteSalle, Integer> {
    List<VPlainteSalle> findAllByEtat(Integer etat);
}