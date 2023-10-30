package com.service.maintenance.repository;

import com.service.maintenance.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;


public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
    Utilisateur findByEmailAndMdp(String email,String mdp);
}