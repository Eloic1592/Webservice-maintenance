package com.service.maintenance.model;

import javax.persistence.*;

@Entity
@Table(name = "type_utilisateur")
public class TypeUtilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type_utilisateur", nullable = false)
    private String typeUtilisateur;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(String typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}