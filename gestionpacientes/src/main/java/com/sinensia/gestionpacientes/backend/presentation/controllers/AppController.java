package com.sinensia.gestionpacientes.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.model.Usuario;
import com.sinensia.gestionpacientes.backend.business.services.RegistroServices;
import com.sinensia.gestionpacientes.backend.business.services.UsuarioServices;

@Controller
@RequestMapping("/gestion-salud")
public class AppController {

	@Autowired
	private UsuarioServices usuarioService;
	
	@Autowired
	private RegistroServices registroService;
	
	@RequestMapping(value = {"/home","/",""})
	public String home() {
		return "index";									
	}
	
	@RequestMapping("/listado-usuarios")
	public String getListadoUsuarios(Model model) {
		
		List<Usuario> usuarios = usuarioService.getAll();
		
		model.addAttribute("usuarios", usuarios);
		
		return "usuarios";
	}
	
	@RequestMapping("/listado-registros")
	public String getListadoRegistros(Model model) {
		
		List<Registro> registros = registroService.getAll();
		
		model.addAttribute("registros", registros);
		
		return "registros";
	}
}
