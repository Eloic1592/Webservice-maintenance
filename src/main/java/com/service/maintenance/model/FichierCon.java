package com.service.maintenance.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "fichier_con")
public class FichierCon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idcon", nullable = false)
    private Integer idcon;

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

    public Integer getIdcon() {
        return idcon;
    }

    public void setIdcon(Integer idcon) {
        this.idcon = idcon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}