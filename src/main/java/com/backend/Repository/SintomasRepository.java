package com.backend.Repository;

import com.backend.Model.Entidades.SintomasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SintomasRepository extends JpaRepository<SintomasModel, UUID> {
}
