package com.service.maintenance.controller;

import com.service.maintenance.model.Technicien;
import com.service.maintenance.model.Tokentech;
import com.service.maintenance.repository.TechnicienRepository;
import com.service.maintenance.repository.TokentechRepository;
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

    @Autowired
    TokentechRepository tokentechRepository;

    @PostMapping("/signinTech")
    public ResponseEntity<Tokentech> login(@RequestBody Technicien tech) throws Exception {

        if( technicienRepository.findByCodeAndMdp(tech.getCode(),tech.getMdp()) != null) {
            Technicien ad = technicienRepository.findByCodeAndMdp(tech.getCode(),tech.getMdp());
            Tokentech t = new mix.projetcloudenchere.service.TokenService().createTokenTech(ad);
            Tokentech saved = tokentechRepository.save(t);
            return new ResponseEntity<>(saved, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
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
	    System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/findtech/{id}")
    public ResponseEntity<Technicien> find(@PathVariable Integer id){
        try {
            Technicien technicien=technicienRepository.findTechnicienById(id);
            if (technicien==null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(technicien, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouveau technicien
    @PutMapping("/updatetechnicien")
    public ResponseEntity<Technicien> updatetechnicien(@RequestBody Technicien v) {
        try {
            technicienRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
