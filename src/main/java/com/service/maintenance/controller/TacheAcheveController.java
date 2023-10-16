package com.service.maintenance.controller;

import com.service.maintenance.model.Tache;
import com.service.maintenance.model.TacheAcheve;
import com.service.maintenance.model.TypeEntretien;
import com.service.maintenance.repository.TacheAcheveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TacheAcheveController {
    @Autowired
    TacheAcheveRepository tacheAcheveRepository;

//    Liste des taches achevees
    @GetMapping("/getalltacheachevees")
    public ResponseEntity<List<TacheAcheve>> getlist(){
        try {
            List<TacheAcheve> tacheAcheves = new ArrayList<TacheAcheve>();
            tacheAcheveRepository.findAllByEtat(0).forEach(tacheAcheves::add);
            if (tacheAcheves.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tacheAcheves, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouvelle tache achevees
    @PostMapping("/inserttacheachevees")
    public ResponseEntity<TacheAcheve> insertTacheachevees(@RequestBody TacheAcheve v) {
        try {
            tacheAcheveRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
