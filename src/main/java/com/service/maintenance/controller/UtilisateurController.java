package com.service.maintenance.controller;


import com.service.maintenance.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

//    @GetMapping("/getuser")
//    public ResponseEntity<Utilisateur> getuser(Utilisateur user){
//        try {
//            Utilisateur utilisateur = utilisateurRepository.findByEmailAndMdp(user);
//            if (utilisateur==null) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
//        } catch (Exception e) {
//            System.out.println("Message:"+e.getMessage());
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
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
