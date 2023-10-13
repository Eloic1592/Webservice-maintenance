package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "intervention")
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idtache", nullable = false)
    private Integer idtache;

    @Column(name = "identretien", nullable = false)
    private Integer identretien;

    @Column(name = "entretien", nullable = false)
    private String entretien;

    @Column(name = "date_int")
    private Timestamp dateInt;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Timestamp getDateInt() {
        return dateInt;
    }

    public void setDateInt(Timestamp dateInt) {
        this.dateInt = dateInt;
    }

    public String getEntretien() {
        return entretien;
    }

    public void setEntretien(String entretien) {
        this.entretien = entretien;
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