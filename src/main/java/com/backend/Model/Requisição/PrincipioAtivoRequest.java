package com.backend.Model.Requisição;

import com.backend.Model.Entidades.SintomasModel;

import java.util.List;

public class PrincipioAtivoRequest {
    private String name;
    private List<SintomasModel> sintomas;

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
