package com.sinensia.gestionpacientes.backend.business.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.model.Usuario;
import com.sinensia.gestionpacientes.backend.business.services.UsuarioServices;
import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.model.UsuarioPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;
import com.sinensia.gestionpacientes.backend.integration.repositories.UsuarioPLRepository;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private UsuarioPLRepository usuarioPLRepository;
	
	//TODO: Preguntar a Jordi donde van los metodos de registros de un usuario
	@Autowired
	private RegistroPLRepository registroPLRepository;	
	
	@Override
	public Usuario save(Usuario usuario) {
		
		UsuarioPL usuarioPL = dozerBeanMapper.map(usuario, UsuarioPL.class);
		
		Usuario createdUsuario = dozerBeanMapper.map(usuarioPLRepository.save(usuarioPL), Usuario.class);
		
		return createdUsuario;
	}
	
	@Override
	public List<Usuario> getAll() {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		List<UsuarioPL> usuariosPL = usuarioPLRepository.findAll();
		
		for (UsuarioPL usuarioPL : usuariosPL) {
			
			usuarios.add(dozerBeanMapper.map(usuarioPL, Usuario.class));
			
		}
		
		return usuarios;
	}

	@Override
	public Usuario getByDNI(String dni) {
		
		Optional<UsuarioPL> optionalUsuarioPL = usuarioPLRepository.findById(dni);
		UsuarioPL usuarioPL = optionalUsuarioPL.orElse(null);
		
		Usuario usuario = dozerBeanMapper.map(usuarioPL, Usuario.class);
		
		return usuario;
	}
	
	@Override
	public List<Registro> getByDNILecturas(String dni) {
		
		List<Registro> registros = new ArrayList<>();
		
		List<RegistroPL> registrosPL = registroPLRepository.findByUsuarioDni(dni);
		
		for (RegistroPL registroPL : registrosPL) {
			
			registros.add(dozerBeanMapper.map(registroPL, Registro.class));
		}
		
		return registros;
	}
	
	@Override
	public List<Registro> getByDNILecturasFecha(String dni, Date fechaDesde, Date fechaHasta){
		
		List<Registro> registros = new ArrayList<>();
		
		List<RegistroPL> registrosPL = registroPLRepository.findByHoraRegistroBetweenAndUsuarioDni(fechaDesde,fechaHasta,dni);
		
		for (RegistroPL registroPL : registrosPL) {
			
			registros.add(dozerBeanMapper.map(registroPL, Registro.class));
		}
		
		return registros;
	}
	
}
