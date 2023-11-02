package com.service.maintenance.controller;


import com.service.maintenance.model.Admin;
import com.service.maintenance.model.Tokenadmin;
import com.service.maintenance.repository.AdminRepository;
import com.service.maintenance.repository.TokenadminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mix.projetcloudenchere.service.TokenService;

@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminRepository adminRepository;


    @Autowired
    TokenadminRepository tokenadmin;

    @PostMapping("/signinAdmin")
    public ResponseEntity<Tokenadmin> login(@RequestBody Admin admin) throws Exception {

        if( adminRepository.findByEmailAndMdp(admin.getEmail(),admin.getMdp()) != null) {
            Admin ad = adminRepository.findByEmailAndMdp(admin.getEmail(),admin.getMdp());
            System.out.println();
            Tokenadmin t = new TokenService().createTokenAdmin(ad);
            Tokenadmin saved = tokenadmin.save(t);
            return new ResponseEntity<>(saved, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
