package com.sinensia.gestionpacientes.backend.presentation.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.services.RegistroServices;
import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/lecturas")
public class RegistroController {

	@Autowired
	private RegistroServices registroServices;
	
	@GetMapping
	public List<Registro> getAll() {
		return registroServices.getAll();
	}
	
	@GetMapping("/{id}")
	public Registro getByID(@PathVariable Integer id) {		
		return registroServices.getById(id);
	}
	
	@PostMapping
	public Registro create(@RequestBody Registro registro) {
		return registroServices.save(registro);
	}
}
