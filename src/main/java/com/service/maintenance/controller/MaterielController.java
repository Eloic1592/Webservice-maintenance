package com.service.maintenance.controller;

import com.service.maintenance.model.Materiel;
import com.service.maintenance.repository.MaterielRepository;
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
public class MaterielController {

    @Autowired
    MaterielRepository materielRepository;

    @GetMapping("/getmateriel")
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

}
