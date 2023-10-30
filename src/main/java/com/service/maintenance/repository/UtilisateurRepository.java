package com.service.maintenance.repository;

import com.service.maintenance.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.rmi.CORBA.Util;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByEmailAndMdp(Utilisateur user);
}