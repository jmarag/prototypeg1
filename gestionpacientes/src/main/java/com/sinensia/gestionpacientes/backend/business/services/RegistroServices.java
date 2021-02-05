package com.sinensia.gestionpacientes.backend.business.services;

import java.util.List;


import com.sinensia.gestionpacientes.backend.business.model.Registro;

public interface RegistroServices {

	public Registro save(Registro registro);

	public List<Registro> getAll();

	public Registro read(int id);

}
