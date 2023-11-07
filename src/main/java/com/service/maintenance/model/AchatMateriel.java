package com.service.maintenance.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "achat_materiel")
public class AchatMateriel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "quantite", precision = 15, scale = 2)
    private BigDecimal quantite;

    @Column(name = "prixunitaire", precision = 15, scale = 2)
    private BigDecimal prixunitaire;

    @Column(name = "idachat", nullable = false)
    private Integer idachat;

    @Column(name = "etat", nullable = false)
    private Integer etat;

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getIdachat() {
        return idachat;
    }

    public void setIdachat(Integer idachat) {
        this.idachat = idachat;
    }

    public BigDecimal getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(BigDecimal prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}