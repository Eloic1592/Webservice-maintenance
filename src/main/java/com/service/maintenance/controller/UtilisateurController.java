package com.service.maintenance.controller;


import com.service.maintenance.model.Utilisateur;
import com.service.maintenance.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @PostMapping("/finduser")
    public ResponseEntity<Utilisateur> login(@RequestBody String email,String mdp) {
        try {
            Utilisateur v=utilisateurRepository.findByEmailAndMdp(email, mdp);
            if (v==null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    Insertion nouvelle type entretien
    @PostMapping("/insertuser")
    public ResponseEntity<Utilisateur> insertutilisateur(@RequestBody Utilisateur v) {
        try {
            utilisateurRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

