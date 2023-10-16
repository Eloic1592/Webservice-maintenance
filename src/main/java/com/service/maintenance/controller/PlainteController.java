package com.service.maintenance.controller;


import com.service.maintenance.model.Plainte;
import com.service.maintenance.repository.PlainteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class PlainteController {

    @Autowired
    PlainteRepository plainteRepository;

//    Liste des plaintes
    @GetMapping("/getallplainte")
    public ResponseEntity<List<Plainte>> getlist(){
        try {
            List<Plainte> plaintes = new ArrayList<Plainte>();
            plainteRepository.findAllByEtat(0).forEach(plaintes::add);

            if (plaintes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(plaintes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    Insertion nouvel intervention
    @PostMapping("/insertplainte")
    public ResponseEntity<Plainte> insertIntervention(@RequestBody Plainte v) {
        try {
            plainteRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
