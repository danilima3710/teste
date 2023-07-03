package com.backend.Model.Entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Remedio")
public class RemedioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Nome")
    private String name;

    @ManyToMany
    private List<ComposicaoModel> composicaoList;

    public RemedioModel() {

    }

    public RemedioModel(UUID id, String name, List<ComposicaoModel> composicaoList) {
        this.id = id;
        this.name = name;
        this.composicaoList = composicaoList;
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

    public List<ComposicaoModel> getComposicaoList() {
        return composicaoList;
    }

    public void setComposicaoList(List<ComposicaoModel> composicaoList) {
        this.composicaoList = composicaoList;
    }
}
