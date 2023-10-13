package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tache")
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idplainte",nullable = false)
    private Integer idplainte;

    @Column(name = "idtechnicien",nullable = false)
    private Integer idtechnicien;

    @Column(name = "identretien",nullable = false)
    private Integer identretien;

    @Column(name = "designation")
    private String designation;

    @Column(name = "date_tache",nullable = false)
    private Timestamp dateTache;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Timestamp getDateTache() {
        return dateTache;
    }

    public void setDateTache(Timestamp dateTache) {
        this.dateTache = dateTache;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getIdentretien() {
        return identretien;
    }

    public void setIdentretien(Integer identretien) {
        this.identretien = identretien;
    }

    public Integer getIdtechnicien() {
        return idtechnicien;
    }

    public void setIdtechnicien(Integer idtechnicien) {
        this.idtechnicien = idtechnicien;
    }

    public Integer getIdplainte() {
        return idplainte;
    }

    public void setIdplainte(Integer idplainte) {
        this.idplainte = idplainte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}