package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "disponibilite")
public class Disponibilite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idtechnicien")
    private Integer idtechnicien;

    @Column(name = "date_debut")
    private Timestamp dateDebut;

    @Column(name = "date_fin")
    private Timestamp dateFin;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Timestamp getDateFin() {
        return dateFin;
    }

    public void setDateFin(Timestamp dateFin) {
        this.dateFin = dateFin;
    }

    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getIdtechnicien() {
        return idtechnicien;
    }

    public void setIdtechnicien(Integer idtechnicien) {
        this.idtechnicien = idtechnicien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}