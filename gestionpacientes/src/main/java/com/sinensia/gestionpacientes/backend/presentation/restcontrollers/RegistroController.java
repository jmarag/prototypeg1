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

import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/lecturas")
public class RegistroController {

	@Autowired
	private RegistroPLRepository registroPLRepository;
	
	@GetMapping
	public List<RegistroPL> getAll() {

		return registroPLRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public RegistroPL getByID(@PathVariable Integer id) {
		Optional<RegistroPL> optionalRegistroPL = registroPLRepository.findById(id);
		RegistroPL registroPL = optionalRegistroPL.orElse(null);
		
		return registroPL;
	}
	
	@PostMapping
	public RegistroPL create(@RequestBody RegistroPL registro) {

		return registroPLRepository.save(registro);
	}
}
