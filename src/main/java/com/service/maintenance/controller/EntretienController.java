package com.service.maintenance.controller;

import com.service.maintenance.model.Entretien;
import com.service.maintenance.model.VEntretien;
import com.service.maintenance.repository.EntretienRepository;
import com.service.maintenance.repository.VEntretienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class EntretienController {

    @Autowired
    EntretienRepository entretienRepository;

    @Autowired
    VEntretienRepository vEntretienRepository;

//    Liste des entretiens
    @GetMapping("/getallentretien")
    public ResponseEntity<List<Entretien>> getlist(){
        try {
            List<Entretien> entretiens = new ArrayList<Entretien>();
            entretienRepository.findAllByEtat(0).forEach(entretiens::add);
            if (entretiens.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entretiens, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    //    Insertion un nouvel entretien
    @PostMapping("/insertentretien")
    public ResponseEntity<Entretien> insertEntretien(@RequestBody Entretien v) {
        try {
            entretienRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    Liste des entretiens
    @GetMapping("/getallventretien")
    public ResponseEntity<List<VEntretien>> getlistentretien(){
        try {
            List<VEntretien> vEntretiens = new ArrayList<VEntretien>();
            vEntretienRepository.findAllByEtat(0).forEach(vEntretiens::add);
            if (vEntretiens.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vEntretiens, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
