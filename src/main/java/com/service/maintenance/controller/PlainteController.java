package com.service.maintenance.controller;


import com.service.maintenance.model.Plainte;
import com.service.maintenance.model.VPlainteInd;
import com.service.maintenance.model.VPlainteSalle;
import com.service.maintenance.repository.PlainteRepository;
import com.service.maintenance.repository.VPlainteIndRepository;
import com.service.maintenance.repository.VPlainteSalleRepository;
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

    @Autowired
    VPlainteIndRepository vPlainteIndRepository;

    @Autowired
    VPlainteSalleRepository vPlainteSalleRepository;

//    Liste des plaintes individuels
    @GetMapping("/getplainteind")
    public ResponseEntity<List<VPlainteInd>> getlistind(){
        try {
            List<VPlainteInd> vPlainteInds = new ArrayList<VPlainteInd>();
            vPlainteIndRepository.findAllByEtat(0).forEach(vPlainteInds::add);

            if (vPlainteInds.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vPlainteInds, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Liste des plaintes
    @GetMapping("/getplaintesalle")
    public ResponseEntity<List<VPlainteSalle>> getlistsall(){
        try {
            List<VPlainteSalle> vPlainteSalles = new ArrayList<VPlainteSalle>();
            vPlainteSalleRepository.findAllByEtat(0).forEach(vPlainteSalles::add);

            if (vPlainteSalles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vPlainteSalles, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
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
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
