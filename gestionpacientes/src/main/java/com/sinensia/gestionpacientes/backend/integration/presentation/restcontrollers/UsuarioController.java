package com.sinensia.gestionpacientes.backend.integration.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionpacientes.backend.business.model.Usuario;
import com.sinensia.gestionpacientes.backend.business.services.UsuarioServices;
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
}
