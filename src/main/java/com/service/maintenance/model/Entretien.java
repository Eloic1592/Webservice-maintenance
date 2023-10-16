package com.service.maintenance.model;

import javax.persistence.*;

@Entity
@Table(name = "entretien")
public class Entretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idtype_entretien", nullable = false)
    private Integer idtypeEntretien;

    @Column(name = "idmateriel", nullable = false)
    private Integer idmateriel;

    @Column(name = "entretien", nullable = false)
    private String entretien;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public String getEntretien() {
        return entretien;
    }

    public void setEntretien(String entretien) {
        this.entretien = entretien;
    }

    public Integer getIdmateriel() {
        return idmateriel;
    }

    public void setIdmateriel(Integer idmateriel) {
        this.idmateriel = idmateriel;
    }

    public Integer getIdtypeEntretien() {
        return idtypeEntretien;
    }

    public void setIdtypeEntretien(Integer idtypeEntretien) {
        this.idtypeEntretien = idtypeEntretien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}