package com.service.maintenance.controller;

import com.service.maintenance.model.Intervention;
import com.service.maintenance.model.Technicien;
import com.service.maintenance.repository.TechnicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TechnicienController {
    @Autowired
    TechnicienRepository technicienRepository;

//    Liste des techniciens
    @GetMapping("/gettechnicien")
    public ResponseEntity<List<Technicien>> getlist(){
        try {
            List<Technicien> techniciens = new ArrayList<Technicien>();
            technicienRepository.findAllByEtat(0).forEach(techniciens::add);
            if (techniciens.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(techniciens, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouveau technicien
    @PostMapping("/inserttechnicien")
    public ResponseEntity<Technicien> insertTechnicien(@RequestBody Technicien v) {
        try {
            technicienRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
