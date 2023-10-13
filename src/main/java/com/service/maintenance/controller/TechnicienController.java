package com.service.maintenance.controller;

import com.service.maintenance.model.Technicien;
import com.service.maintenance.repository.TechnicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TechnicienController {
    @Autowired
    TechnicienRepository technicienRepository;

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
}
