package com.backend.Controller;

import com.backend.Model.Entidades.RemedioModel;
import com.backend.Repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/remedio")
public class RemedioController {
    @Autowired
    RemedioRepository repository;

    @PostMapping
    public RemedioModel gravar(@RequestBody RemedioModel remedioModel) {
        RemedioModel remedio = new RemedioModel(UUID.randomUUID(), remedioModel.getName(), remedioModel.getComposicaoList());
        return repository.save(remedio);
    }

    @GetMapping
    public List<RemedioModel> buscar() {
        return repository.findAll();
    }

    @PutMapping
    public RemedioModel alterar(@RequestBody UUID id, @RequestBody RemedioModel remedioModelNew) {
        Optional<RemedioModel> remedioOpt = repository.findById(id);

        if (remedioOpt.isEmpty())
            throw new RuntimeException("Remedio não encontrado");

        RemedioModel remedioModelOld = remedioOpt.get();
        remedioModelOld.setName(remedioModelNew.getName());
        remedioModelOld.setComposicaoList(remedioModelNew.getComposicaoList());

        return repository.save(remedioModelOld);
    }

    @DeleteMapping
    public void deletar(@RequestBody UUID id) {
        repository.deleteById(id);
    }
}
