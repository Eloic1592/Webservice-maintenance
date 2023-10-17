package com.service.maintenance.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Table(name = "v_entretien")
public class VEntretien {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "type_entretien")
    private String typeEntretien;

    @Column(name = "entretien")
    private String entretien;


    @Column(name = "materiel")
    private String materiel;

    @Column(name = "etat")
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public String getMateriel() {
        return materiel;
    }

    public String getEntretien() {
        return entretien;
    }

    public String getTypeEntretien() {
        return typeEntretien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypeEntretien(String typeEntretien) {
        this.typeEntretien = typeEntretien;
    }

    public void setEntretien(String entretien) {
        this.entretien = entretien;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    protected VEntretien() {
    }
}