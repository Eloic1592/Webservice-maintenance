package com.service.maintenance.model;

import javax.persistence.*;

@Entity
@Table(name = "tache_tech")
public class TacheTech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idtache", nullable = false)
    private Integer idtache;


    @Column(name = "identretien", nullable = false)
    private Integer identretien;


    @Column(name = "idtechnicien", nullable = false)
    private Integer idtechnicien;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getIdtechnicien() {
        return idtechnicien;
    }

    public void setIdtechnicien(Integer idtechnicien) {
        this.idtechnicien = idtechnicien;
    }

    public Integer getIdentretien() {
        return identretien;
    }

    public void setIdentretien(Integer identretien) {
        this.identretien = identretien;
    }

    public Integer getIdtache() {
        return idtache;
    }

    public void setIdtache(Integer idtache) {
        this.idtache = idtache;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}