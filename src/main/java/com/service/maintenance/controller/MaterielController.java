package com.service.maintenance.controller;

import com.service.maintenance.model.Materiel;
import com.service.maintenance.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class MaterielController {

    @Autowired
    MaterielRepository materielRepository;

//    Liste de materiels
    @GetMapping("/getallmateriel")
    public ResponseEntity<List<Materiel>> getlist(){
        try {
            List<Materiel> materiels = new ArrayList<Materiel>();
                materielRepository.findAllByEtat(0).forEach(materiels::add);

            if (materiels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materiels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    Insertion nouveau materiel
    @PutMapping("/updatemateriel")
    public ResponseEntity<Materiel> updateMateriel(@RequestBody Materiel v) {
        try {
            materielRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findmateriel/{id}")
    public ResponseEntity<Materiel> find(@PathVariable Integer id){
        try {
            Materiel materiel=materielRepository.findMaterielById(id);
            if (materiel==null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materiel, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Message:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //    Insertion nouveau materiel
    @PostMapping("/insertmateriel")
    public ResponseEntity<Materiel> insertMateriel(@RequestBody Materiel v) {
        try {
            materielRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
