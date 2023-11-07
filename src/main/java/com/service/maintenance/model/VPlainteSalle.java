package com.service.maintenance.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Immutable
@Table(name = "v_plainte_salle")
public class VPlainteSalle {
    @Id
    @Column(name = "idplainte")
    private Integer idplainte;

    @Column(name = "idsalle")
    private String idsalle;


    @Column(name = "salle")
    private String salle;


    @Column(name = "materiel")
    private String materiel;


    @Column(name = "description")
    private String description;

    @Column(name = "date_depot")
    private Timestamp dateDepot;

    @Column(name = "etat")
    private Integer etat;

    public Timestamp getDateDepot() {
        return dateDepot;
    }

    public String getDescription() {
        return description;
    }

    public String getMateriel() {
        return materiel;
    }

    public String getSalle() {
        return salle;
    }

    public String getIdsalle() {
        return idsalle;
    }

    public Integer getIdplainte() {
        return idplainte;
    }

    public Integer getEtat() {
        return etat;
    }

    protected VPlainteSalle() {
    }
}