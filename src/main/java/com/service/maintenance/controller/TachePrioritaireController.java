package com.service.maintenance.controller;

import com.service.maintenance.model.TacheAcheve;
import com.service.maintenance.model.TachePrioritaire;
import com.service.maintenance.repository.TachePrioritaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TachePrioritaireController {
    @Autowired
    TachePrioritaireRepository tachePrioritaireRepository;

//    Liste des taches prioritaire
    @GetMapping("/getalltacheprioritaire")
    public ResponseEntity<List<TachePrioritaire>> getlist(){
        try {
            List<TachePrioritaire> tachePrioritaires = new ArrayList<TachePrioritaire>();
            tachePrioritaireRepository.findAllByEtat(0).forEach(tachePrioritaires::add);
            if (tachePrioritaires.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tachePrioritaires, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouvelle tache prioritaire
    @PostMapping("/inserttacheprioritaire")
    public ResponseEntity<TachePrioritaire> insertTacheprioritaires(@RequestBody TachePrioritaire v) {
        try {
            tachePrioritaireRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
