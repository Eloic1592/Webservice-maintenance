package com.service.maintenance.controller;

import com.service.maintenance.model.Tache;
import com.service.maintenance.model.VTache;
import com.service.maintenance.repository.TacheRepository;
import com.service.maintenance.repository.VTacheRepository;
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

    @Autowired
    VTacheRepository vTacheRepository;

//    Liste des taches
    @GetMapping("/getalltache")
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

    @GetMapping("/getallvtache")
    public ResponseEntity<List<VTache>> getlistvtache(){
        try {
            List<VTache> vTaches = new ArrayList<VTache>();
            vTacheRepository.findAllByEtat(0).forEach(vTaches::add);
            if (vTaches.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vTaches, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findtache/{id}")
    public ResponseEntity<Tache> find(@PathVariable Integer id){
        try {
            Tache tache=tacheRepository.findTacheById(id);
            if (tache==null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tache, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
