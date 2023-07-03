package com.backend.Controller;

import com.backend.Model.Entidades.RemedioModel;
import com.backend.Model.Requisição.FiltroBuscaRequest;
import com.backend.Repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/busca")
public class RealizaBuscaController {

    @Autowired
    RemedioRepository repository;

    @PostMapping
    public List<RemedioModel> buscar(@RequestBody FiltroBuscaRequest request) {

    }

    private List<RemedioModel> buscarPorNome(String nome) {
        
    }

}
