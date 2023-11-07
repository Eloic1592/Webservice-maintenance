package com.service.maintenance.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Immutable
@Table(name = "v_plainte_ind")
public class VPlainteInd {
    @Id
    @Column(name = "idplainte")
    private Integer idplainte;


    @Column(name = "nom")
    private String nom;

    @Column(name = "idutilisateur")
    private Integer idutilisateur;

    @Column(name = "type_utilisateur")
    private String typeUtilisateur;


    @Column(name = "materiel")
    private String materiel;


    @Column(name = "description")
    private String description;

    @Column(name = "date_depot")
    private Timestamp dateDepot;

    @Column(name = "etat")
    private Integer etat;

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public Timestamp getDateDepot() {
        return dateDepot;
    }

    public String getDescription() {
        return description;
    }

    public String getMateriel() {
        return materiel;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public Integer getIdplainte() {
        return idplainte;
    }

    public Integer getEtat() {
        return etat;
    }

    protected VPlainteInd() {
    }
}