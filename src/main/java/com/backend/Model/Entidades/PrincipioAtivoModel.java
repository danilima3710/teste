package com.backend.Model.Entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PrincipioAtivo")
public class PrincipioAtivoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Nome")
    private String name;

    @ManyToMany
    private List<SintomasModel> sintomas;

    public PrincipioAtivoModel(){

    }

    public PrincipioAtivoModel(UUID id, String name, List<SintomasModel> sintomas) {
        this.id = id;
        this.name = name;
        this.sintomas = sintomas;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SintomasModel> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<SintomasModel> sintomas) {
        this.sintomas = sintomas;
    }
}
