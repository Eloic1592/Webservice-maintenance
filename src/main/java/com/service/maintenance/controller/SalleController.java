package com.service.maintenance.controller;

import com.service.maintenance.model.Salle;
import com.service.maintenance.repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class SalleController {
    @Autowired
    SalleRepository salleRepository;

//    Liste des types d'entretiens
    @GetMapping("/getallsalle")
    public ResponseEntity<List<Salle>> getlist(){
        try {
            List<Salle> salles = new ArrayList<Salle>();
            salleRepository.findAllByEtat(0).forEach(salles::add);
            if (salles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(salles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouvelle type entretien
    @PostMapping("/insertsalle")
    public ResponseEntity<Salle> insertnewsalle(@RequestBody Salle v) {
        try {
            salleRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
