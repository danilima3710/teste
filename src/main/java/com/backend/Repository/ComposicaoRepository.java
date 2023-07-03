package com.backend.Repository;

import com.backend.Model.Entidades.ComposicaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComposicaoRepository extends JpaRepository<ComposicaoModel, UUID> {
}
