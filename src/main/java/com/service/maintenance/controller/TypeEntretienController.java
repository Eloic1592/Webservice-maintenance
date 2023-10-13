package com.service.maintenance.controller;

import com.service.maintenance.model.TypeEntretien;
import com.service.maintenance.repository.TypeEntretienRepository;
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
public class TypeEntretienController {
    @Autowired
    TypeEntretienRepository typeEntretienRepository;

    @GetMapping("/gettypeentretien")
    public ResponseEntity<List<TypeEntretien>> getlist(){
        try {
            List<TypeEntretien> typeEntretiens = new ArrayList<TypeEntretien>();
            typeEntretienRepository.findAllByEtat(0).forEach(typeEntretiens::add);
            if (typeEntretiens.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(typeEntretiens, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
