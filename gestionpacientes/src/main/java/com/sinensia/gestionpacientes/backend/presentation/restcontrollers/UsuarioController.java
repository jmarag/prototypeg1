package com.sinensia.gestionpacientes.backend.presentation.restcontrollers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.model.UsuarioPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;
import com.sinensia.gestionpacientes.backend.integration.repositories.UsuarioPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioPLRepository usuarioPLRepository;
	
	@Autowired
	private RegistroPLRepository registroPLRepository;

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
	
	@GetMapping("/{dni}/lecturas")
	public List<RegistroPL> getByDNILecturas(@PathVariable String dni) {
		return registroPLRepository.findByUsuarioDni(dni);
	}
	
	@GetMapping("/{dni}/lecturas-fecha")
	public List<RegistroPL> getByDNILecturasFecha(@PathVariable String dni,  
			@RequestParam (name="desde") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaDesde, 
			@RequestParam (name="hasta") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaHasta){
		
		return registroPLRepository.findByHoraRegistroBetweenAndUsuarioDni(fechaDesde,fechaHasta,dni);
	}

	@PostMapping
	public UsuarioPL create(@RequestBody UsuarioPL usuario) {

		return usuarioPLRepository.save(usuario);
	}
}
