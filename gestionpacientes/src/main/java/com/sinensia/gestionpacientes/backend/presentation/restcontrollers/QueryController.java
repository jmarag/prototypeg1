package com.sinensia.gestionpacientes.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionpacientes.backend.integration.repositories.UsuarioPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/pruebas")
public class QueryController {

	@Autowired
	private UsuarioPLRepository	usuarioPLRepository;
	
	@GetMapping("/uno")
	public List<Double[]> getMediaPresionMes() {
		
		String dni = "74253210W";
		
		int anyo = 2020;
		
		int mes = 10;
		
		return usuarioPLRepository.getPresionMediaMes(dni,anyo,mes);
	}
	
	@GetMapping("/dos")
	public Double getPesoMedioMes() {
		
		String dni = "33578057X";
		
		int anyo = 2020;
		
		int mes = 10;
		
		return usuarioPLRepository.getPesoMedioMes(dni,anyo,mes);
	}
	
	@GetMapping("/tres")
	public List<Double[]> getPesoMedioAnyo() {
		
		String dni = "33578057X";
		
		int anyo = 2020;
		
		return usuarioPLRepository.getPesoMedioAnyo(dni,anyo);
	}
}
