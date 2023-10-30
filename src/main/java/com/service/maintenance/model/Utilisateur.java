package com.service.maintenance.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 100)
    private String prenom;

    @Column(name = "dtn", nullable = false)
    private LocalDate dtn;

    @Column(name = "code")
    private String code;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "mdp", nullable = false, length = 100)
    private String mdp;

    @Column(name = "idtype_utilisateur", nullable = false, length = 100)
    private Integer idtypeUtilisateur;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getIdtypeUtilisateur() {
        return idtypeUtilisateur;
    }

    public void setIdtypeUtilisateur(Integer idtypeUtilisateur) {
        this.idtypeUtilisateur = idtypeUtilisateur;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getDtn() {
        return dtn;
    }

    public void setDtn(LocalDate dtn) {
        this.dtn = dtn;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}