package com.service.maintenance.controller;


import com.service.maintenance.model.*;
import com.service.maintenance.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
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

    @Autowired
    PlainteIndividuelRepository plainteIndividuelRepository;

    @Autowired
    PlainteSalleRepository plainteSalleRepository;

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
    @GetMapping("/getplainteuser/{iduser}")
    public ResponseEntity<List<VPlainteInd>> getlistinduser(@PathVariable Integer iduser){
        try {
            List<VPlainteInd> vPlainteInds = new ArrayList<VPlainteInd>();
            vPlainteIndRepository.findAllByIdutilisateur(iduser).forEach(vPlainteInds::add);

            if (vPlainteInds.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vPlainteInds, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findvplainte/{idplainte}")
    public ResponseEntity<VPlainteInd> find(@PathVariable Integer idplainte){
        try {
            VPlainteInd vPlainteInd=vPlainteIndRepository.findVPlainteIndByIdplainte(idplainte);
            if (vPlainteInd==null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(vPlainteInd, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
