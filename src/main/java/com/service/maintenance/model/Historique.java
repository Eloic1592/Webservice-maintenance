package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "historique")
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "mot_cle", nullable = false)
    private String motCle;

    @Column(name = "historique")
    private String historique;

    @Column(name = "date_historique")
    private Timestamp dateHistorique;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Timestamp getDateHistorique() {
        return dateHistorique;
    }

    public void setDateHistorique(Timestamp dateHistorique) {
        this.dateHistorique = dateHistorique;
    }

    public String getHistorique() {
        return historique;
    }

    public void setHistorique(String historique) {
        this.historique = historique;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}