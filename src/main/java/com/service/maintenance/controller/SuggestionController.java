package com.service.maintenance.controller;


import com.service.maintenance.model.Suggestion;
import com.service.maintenance.repository.SuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
public class SuggestionController {

    @Autowired
    SuggestionRepository suggestionRepository;

//    Liste des suggestions
    @GetMapping("/getallsuggestion")
    public ResponseEntity<List<Suggestion>> getlist(){
        try {
            List<Suggestion> suggestions = new ArrayList<Suggestion>();
            suggestionRepository.findAllByEtat(0).forEach(suggestions::add);

            if (suggestions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(suggestions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    Insertion nouvel suggestion
    @PostMapping("/insertsuggestion")
    public ResponseEntity<Suggestion> insertIntervention(@RequestBody Suggestion v) {
        try {
            suggestionRepository.save(v);
            return new ResponseEntity<>(v, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
