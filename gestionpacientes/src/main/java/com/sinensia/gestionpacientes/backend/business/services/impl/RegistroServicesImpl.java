package com.sinensia.gestionpacientes.backend.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.services.RegistroServices;
import com.sinensia.gestionpacientes.backend.integration.model.RegistroPL;
import com.sinensia.gestionpacientes.backend.integration.repositories.RegistroPLRepository;

@Service
public class RegistroServicesImpl implements RegistroServices {

	@Autowired
	private RegistroPLRepository registroPLRepository;
	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Override
	public Registro save(Registro registro) {
		
		RegistroPL registroPL = dozerBeanMapper.map(registro, RegistroPL.class);
		
		Registro createdRegistro = dozerBeanMapper.map(registroPLRepository.save(registroPL), Registro.class);
		
		return createdRegistro;
	}

	@Override
	public List<Registro> getAll() {
		
		List<Registro> registros = new ArrayList<>();
		
		List<RegistroPL> registrosPL = registroPLRepository.findAll();
		
		for (RegistroPL registroPL : registrosPL) {
			
			registros.add(dozerBeanMapper.map(registroPL, Registro.class));
		}
		
		return registros;
	}

	@Override
	public Registro getById(int id) {
		
		Optional<RegistroPL> optionalRegistroPL = registroPLRepository.findById(id);
		
		Registro registro = dozerBeanMapper.map(optionalRegistroPL.orElse(null), Registro.class);
		
		return registro;
	}

	
}
