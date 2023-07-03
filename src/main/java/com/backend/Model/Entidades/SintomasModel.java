package com.backend.Model.Entidades;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Sintoma")
public class SintomasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Nome")
    private String name;

    public SintomasModel(){

    }

    public SintomasModel(UUID id, String name) {
        this.id = id;
        this.name = name;
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
}
