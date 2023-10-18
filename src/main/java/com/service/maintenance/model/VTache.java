package com.service.maintenance.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Table(name = "v_tache")
public class VTache {

    @Id
    @Column(name = "idtache")
    private Integer idtache;


    @Column(name = "entretien")
    private String entretien;


    @Column(name = "prenom")
    private String prenom;


    @Column(name = "description")
    private String description;

    @Column(name = "etat")
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public String getDescription() {
        return description;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEntretien() {
        return entretien;
    }

    public Integer getIdtache() {
        return idtache;
    }

    public void setIdtache(Integer idtache) {
        this.idtache = idtache;
    }

    public void setEntretien(String entretien) {
        this.entretien = entretien;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    protected VTache() {
    }
}