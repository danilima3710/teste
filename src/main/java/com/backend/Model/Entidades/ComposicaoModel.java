package com.backend.Model.Entidades;

import com.backend.Model.Entidades.PrincipioAtivoModel;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Composicao")
public class ComposicaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Dosagem")
    private long dosagem;

    @OneToOne
    private PrincipioAtivoModel principioAtivoModel;

    public ComposicaoModel() {

    }

    public ComposicaoModel(UUID id, PrincipioAtivoModel principioAtivoModel, long dosagem) {
        this.id = id;
        this.principioAtivoModel = principioAtivoModel;
        this.dosagem = dosagem;
    }

    public PrincipioAtivoModel getPrincipioAtivoModel() {
        return principioAtivoModel;
    }

    public void setPrincipioAtivoModel(PrincipioAtivoModel principioAtivoModel) {
        this.principioAtivoModel = principioAtivoModel;
    }

    public long getDosagem() {
        return dosagem;
    }

    public void setDosagem(long dosagem) {
        this.dosagem = dosagem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
