package com.service.maintenance.controller;

import com.service.maintenance.model.Materiel;
import com.service.maintenance.model.Tache;
import com.service.maintenance.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TacheController {

    @Autowired
    TacheRepository tacheRepository;

    @GetMapping("/gettache")
    public ResponseEntity<List<Tache>> getlist(){
        try {
            List<Tache> taches = new ArrayList<Tache>();
            tacheRepository.findAllByEtat(0).forEach(taches::add);
            if (taches.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(taches, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    Insertion nouvelle tache
    @PostMapping("/inserttache")
    public ResponseEntity<Tache> insertTache(@RequestBody Tache v) {
        try {
            tacheRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
