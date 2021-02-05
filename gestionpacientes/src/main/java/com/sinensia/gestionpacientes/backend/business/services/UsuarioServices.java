package com.sinensia.gestionpacientes.backend.business.services;

import java.util.Date;
import java.util.List;

import com.sinensia.gestionpacientes.backend.business.model.Registro;
import com.sinensia.gestionpacientes.backend.business.model.Usuario;

public interface UsuarioServices {

	public Usuario save(Usuario usuario);

	public List<Usuario> getAll();
	
	public Usuario getByDNI(String dni);

	public List<Registro> getByDNILecturas(String dni);
	
	public List<Registro> getByDNILecturasFecha(String dni, Date fechaDesde, Date fechaHasta);

}
