package com.sinensia.gestionpacientes.backend.presentation.restcontrollers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.model.Usuario;
import com.sinensia.gestionpacientes.backend.business.services.UsuarioServices;
import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServices usuarioServices;
	
	@Autowired
	private RegistroPLRepository registroPLRepository;

	@GetMapping
	public List<Usuario> getAll() {
		return usuarioServices.getAll();
	}
	
	@GetMapping("/{dni}")
	public Usuario getByDNI(@PathVariable String dni) {
		return usuarioServices.getByDNI(dni);
	}
	
	@GetMapping("/{dni}/lecturas")
	public List<Registro> getByDNILecturas(@PathVariable String dni) {
		return usuarioServices.getByDNILecturas(dni);
	}
	
	@GetMapping("/{dni}/lecturas-fecha")
	public List<Registro> getByDNILecturasFecha(@PathVariable String dni,  
			@RequestParam (name="desde") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaDesde, 
			@RequestParam (name="hasta") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaHasta){
		
		return usuarioServices.getByDNILecturasFecha(dni,fechaDesde,fechaHasta);
	}

	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {

		return usuarioServices.save(usuario);
	}
	
	/*
	@PutMapping
	public UsuarioPL update(@RequestBody UsuarioPL usuario) {

		return usuarioPLRepository.save(usuario);
	}
	*/
}
