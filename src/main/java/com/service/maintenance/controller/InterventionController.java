package com.service.maintenance.controller;

import com.service.maintenance.model.Intervention;
import com.service.maintenance.repository.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class InterventionController {

    @Autowired
    InterventionRepository interventionRepository;

//    Liste des interventions
    @GetMapping("/getallinterventions")
    public ResponseEntity<List<Intervention>> getlist(){
        try {
            List<Intervention> interventions = new ArrayList<Intervention>();
            interventionRepository.findAllByEtat(0).forEach(interventions::add);

            if (interventions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(interventions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    Insertion nouvel intervention
    @PostMapping("/insertintervention")
    public ResponseEntity<Intervention> insertIntervention(@RequestBody Intervention v) {
        try {
            interventionRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
