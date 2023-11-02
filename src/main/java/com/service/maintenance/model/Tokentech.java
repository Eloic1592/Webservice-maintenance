package com.service.maintenance.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tokentech")
public class Tokentech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtechnicien")
    private Technicien idtechnicien;

    @Column(name = "token", length = 100)
    private String token;

    @Column(name = "datecreation")
    private LocalDate datecreation;

    @Column(name = "dateexpiration")
    private LocalDate dateexpiration;

    @Column(name = "role", length = 10)
    private String role;

    public Tokentech(Technicien idtechnicien, String token, LocalDate datecreation, LocalDate dateexpiration) {
        this.idtechnicien = idtechnicien;
        this.token = token;
        this.datecreation = datecreation;
        this.dateexpiration = dateexpiration;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(LocalDate dateexpiration) {
        this.dateexpiration = dateexpiration;
    }

    public LocalDate getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(LocalDate datecreation) {
        this.datecreation = datecreation;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Technicien getIdtechnicien() {
        return idtechnicien;
    }

    public void setIdtechnicien(Technicien idtechnicien) {
        this.idtechnicien = idtechnicien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}