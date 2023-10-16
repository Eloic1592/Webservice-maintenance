package com.service.maintenance.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "plainte")
public class Plainte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "date_depot",nullable = false)
    private Timestamp dateDepot;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Timestamp getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Timestamp dateDepot) {
        this.dateDepot = dateDepot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}