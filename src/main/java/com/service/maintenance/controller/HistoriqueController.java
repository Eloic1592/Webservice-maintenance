package com.service.maintenance.controller;

import com.service.maintenance.model.Historique;
import com.service.maintenance.repository.HistoriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class HistoriqueController {

    @Autowired
    HistoriqueRepository historiqueRepository;

//    Liste des historiques
    @GetMapping("/getallhistorique")
    public ResponseEntity<List<Historique>> getlist(){
        try {
            List<Historique> historiques = new ArrayList<Historique>();
            historiqueRepository.findAllByEtat(0).forEach(historiques::add);

            if (historiques.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(historiques, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    Insertion nouvel historique
    @PostMapping("/inserthistorique")
    public ResponseEntity<Historique> insertHistorique(@RequestBody Historique v) {
        try {
            historiqueRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
