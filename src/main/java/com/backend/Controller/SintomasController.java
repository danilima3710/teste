package com.backend.Controller;

import com.backend.Model.Entidades.SintomasModel;
import com.backend.Model.Requisição.SintomasRequest;
import com.backend.Repository.SintomasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sintomas")
public class SintomasController {
    @Autowired
    SintomasRepository repository;

    @PostMapping
    public SintomasModel gravar(@RequestBody SintomasRequest sintomasRequest) {
        SintomasModel principioAtivoModel = new SintomasModel(UUID.randomUUID(), sintomasRequest.getName());
        return repository.save(principioAtivoModel);
    }

    @GetMapping
    public List<SintomasModel> buscar() {
        return repository.findAll();
    }
}
