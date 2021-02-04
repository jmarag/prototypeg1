package com.sinensia.gestionpacientes.backend.business.services;

import java.util.List;

import com.sinensia.gestionpacientes.backend.business.model.Usuario;

public interface UsuarioServices {

	public Usuario save(Usuario usuario);

	public List<Usuario> getAll();

	public Usuario read(int id);

}
