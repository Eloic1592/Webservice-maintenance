package com.service.maintenance.controller;

import com.service.maintenance.model.Disponibilite;
import com.service.maintenance.model.Entretien;
import com.service.maintenance.model.TypeEntretien;
import com.service.maintenance.repository.DisponibiliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class DisponibiliteController {
    @Autowired
    DisponibiliteRepository disponibiliteRepository;

//    Voir toute disponibilite
    @GetMapping("/getalldisponibilite")
    public ResponseEntity<List<Disponibilite>> getlist(){
        try {
            List<Disponibilite> disponibilites = new ArrayList<Disponibilite>();
            disponibiliteRepository.findAllByEtat(0).forEach(disponibilites::add);
            if (disponibilites.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(disponibilites, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    Disponibilite par technicien
    @GetMapping("/getdisptech/{idtech}")
    public ResponseEntity<List<Disponibilite>> getdispotech(Integer idtech,Integer etat){
        try {
            List<Disponibilite> disponibilites = new ArrayList<Disponibilite>();
            disponibiliteRepository.findAllByIdtechnicienAndEtat(idtech,etat).forEach(disponibilites::add);
            if (disponibilites.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(disponibilites, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    Insertion une nouveau disponibilite
    @PostMapping("/insertdisponibilite")
    public ResponseEntity<Disponibilite> insertDisponibilite(@RequestBody Disponibilite v) {
        try {
            disponibiliteRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
