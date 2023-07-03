package com.backend.Controller;

import com.backend.Model.Entidades.PrincipioAtivoModel;
import com.backend.Model.Requisição.PrincipioAtivoRequest;
import com.backend.Repository.PrincipioAtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/principio-ativo")
public class PrincipioAtivoController {

    @Autowired
    private PrincipioAtivoRepository repository;

    @PostMapping
    public PrincipioAtivoModel gravar(@RequestBody PrincipioAtivoRequest principioAtivoRequest) {
        PrincipioAtivoModel principioAtivoModel = new PrincipioAtivoModel(UUID.randomUUID(), principioAtivoRequest.getName(), principioAtivoRequest.getSintomas());
        return repository.save(principioAtivoModel);
    }

    @GetMapping
    public List<PrincipioAtivoModel> buscar() {
        return repository.findAll();
    }

    @DeleteMapping
    public void deletar(@RequestBody UUID id) {
        repository.deleteById(id);
    }

    @PutMapping
    public PrincipioAtivoModel alterar(@RequestBody UUID id, @RequestBody PrincipioAtivoRequest principioAtivoRequest) {
        Optional<PrincipioAtivoModel> principioAtivoOpt = repository.findById(id);

        if (principioAtivoOpt.isEmpty())
            throw new RuntimeException("Principio Ativo não encontrado");

        PrincipioAtivoModel principioAtivoModel = principioAtivoOpt.get();
        principioAtivoModel.setName(principioAtivoRequest.getName());

        return repository.save(principioAtivoModel);
    }

    @GetMapping("/buscar-por-nome")
    public PrincipioAtivoModel buscarPorNome(@RequestBody PrincipioAtivoRequest principioAtivoRequest) {
        Optional<PrincipioAtivoModel> principioAtivoOpt = repository.findByName(principioAtivoRequest.getName());

        if (principioAtivoOpt.isEmpty())
            throw new RuntimeException("Principio Ativo não encontrado");

        return principioAtivoOpt.get();
    }
}
