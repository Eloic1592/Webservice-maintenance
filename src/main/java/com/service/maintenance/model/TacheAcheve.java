package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tache_acheve")
public class TacheAcheve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "idtache", nullable = false)
    private Integer idtache;

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