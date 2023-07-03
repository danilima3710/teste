package com.backend.Repository;

import com.backend.Model.Entidades.RemedioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RemedioRepository extends JpaRepository<RemedioModel, UUID> {
}
