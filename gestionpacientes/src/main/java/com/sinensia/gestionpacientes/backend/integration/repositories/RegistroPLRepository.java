package com.sinensia.gestionpacientes.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;

@Repository
public interface RegistroPLRepository extends JpaRepository<RegistroPL, Integer> {

}
