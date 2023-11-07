package com.service.maintenance.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "fichier_pl")
public class FichierPl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idplainte", nullable = false)
    private Integer idplainte;

    @Column(name = "date_envoi")
    private Instant dateEnvoi;

    @Column(name = "fichier", nullable = false)
    private String fichier;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public Instant getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Instant dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
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