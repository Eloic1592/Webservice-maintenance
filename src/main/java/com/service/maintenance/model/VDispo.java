package com.service.maintenance.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Immutable
@Table(name = "v_dispo")
public class VDispo {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "idtechnicien")
    private Integer idtechnicien;

    @Column(name = "date_debut")
    private Instant dateDebut;

    @Column(name = "date_fin")
    private Instant dateFin;

    @Column(name = "etat")
    private Integer etat;


    @Column(name = "nom")
    private String nom;


    @Column(name = "prenom")
    private String prenom;

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Integer getEtat() {
        return etat;
    }

    public Instant getDateFin() {
        return dateFin;
    }

    public Instant getDateDebut() {
        return dateDebut;
    }

    public Integer getIdtechnicien() {
        return idtechnicien;
    }

    public Integer getId() {
        return id;
    }

    protected VDispo() {
    }
}