package com.sinensia.gestionpacientes.backend.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.gestionpacientes.backend.business.model.Usuario;
import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;

@Repository
public interface RegistroPLRepository extends JpaRepository<RegistroPL, Integer> {

	public List<RegistroPL> findByUsuario(Usuario usuario);
	
	public List<RegistroPL> findByUsuarioDni(String dni);  
	
	public List<RegistroPL> findByHoraRegistroBetweenAndUsuarioDni(Date before, Date after, String dni);  
	
}
