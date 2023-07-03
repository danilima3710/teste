package com.backend.Repository;

import com.backend.Model.Entidades.PrincipioAtivoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PrincipioAtivoRepository extends JpaRepository<PrincipioAtivoModel, UUID> {
    Optional<PrincipioAtivoModel>findByName(String name);
}
