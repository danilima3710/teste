package com.backend.Controller;

import com.backend.Model.Entidades.ComposicaoModel;
import com.backend.Repository.ComposicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/composicao")
public class ComposicaoController {
    @Autowired
    private ComposicaoRepository repository;

    @PostMapping
    public ComposicaoModel gravar(@RequestBody ComposicaoModel composicaoModel) {
        ComposicaoModel principioAtivoModel = new ComposicaoModel(UUID.randomUUID(), composicaoModel.getPrincipioAtivoModel(), composicaoModel.getDosagem());
        return repository.save(principioAtivoModel);
    }

    @GetMapping
    public List<ComposicaoModel> buscar() {
        return repository.findAll();
    }

    @PutMapping
    public ComposicaoModel alterar(@RequestBody UUID id, @RequestBody ComposicaoModel composicaoModelNew) {
        Optional<ComposicaoModel> composicaoOpt = repository.findById(id);

        if(composicaoOpt.isEmpty()) {
            throw new RuntimeException("Composição não encontrada");
        }

        ComposicaoModel composicaoModelOld = composicaoOpt.get();
        composicaoModelOld.setPrincipioAtivoModel(composicaoModelNew.getPrincipioAtivoModel());
        composicaoModelOld.setDosagem(composicaoModelNew.getDosagem());

        return repository.save(composicaoModelOld);
    }

    @DeleteMapping
    public void deletar(@RequestBody UUID id) {
        Optional<ComposicaoModel> composicaoOpt = repository.findById(id);

        if(composicaoOpt.isEmpty()) {
            throw new RuntimeException("Composição não encontrada");
        }

        repository.deleteById(id);
    }
}
