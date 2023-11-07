package com.service.maintenance.model;

import javax.persistence.*;

@Entity
@Table(name = "plainte_individuel")
public class PlainteIndividuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idplainte", nullable = false)
    private Integer idplainte;


    @JoinColumn(name = "idutilisateur", nullable = false)
    private Integer idutilisateur;


    @Column(name = "description")
    private String description;

    @Column(name = "idmateriel", nullable = false)
    private Integer idmateriel;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getIdmateriel() {
        return idmateriel;
    }

    public void setIdmateriel(Integer idmateriel) {
        this.idmateriel = idmateriel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
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