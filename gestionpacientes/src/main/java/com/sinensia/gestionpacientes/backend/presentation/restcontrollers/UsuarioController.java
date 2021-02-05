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

import com.sinensia.gestionpacientes.backend.integration.model.UsuarioPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.UsuarioPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioPLRepository usuarioPLRepository;

	@GetMapping
	public List<UsuarioPL> getAll() {

		return usuarioPLRepository.findAll();
	}
	
	@GetMapping("/{dni}")
	public UsuarioPL getByDNI(@PathVariable String dni) {
		Optional<UsuarioPL> optionalUsuarioPL = usuarioPLRepository.findById(dni);
		UsuarioPL usuarioPL = optionalUsuarioPL.orElse(null);

		return usuarioPL;
	}

	@PostMapping
	public UsuarioPL create(@RequestBody UsuarioPL usuario) {

		return usuarioPLRepository.save(usuario);
	}
}
