package com.sinensia.gestionpacientes.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.gestionpacientes.backend.integration.model.UsuarioPL;

@Repository
public interface UsuarioPLRepository extends JpaRepository<UsuarioPL, String> {

	@Query("select AVG(r.presionMinima), AVG(r.presionMaxima)"
			+ "from RegistroPL r "
			+ "where r.usuario.dni = :dni "
			+ "and year(r.horaRegistro) = :anyo "
			+ "and month(r.horaRegistro) = :mes")
	public List<Double[]> getPresionMediaMes(String dni, int anyo, int mes);
	
	@Query("select AVG(r.peso) "
			+ "from RegistroPL r "
			+ "where r.usuario.dni = :dni "
			+ "and year(r.horaRegistro) = :anyo "
			+ "and month(r.horaRegistro) = :mes")
	public Double getPesoMedioMes(String dni, int anyo, int mes);
	
	@Query("select AVG(r.peso) "
			+ "from RegistroPL r "
			+ "where r.usuario.dni = :dni "
			+ "and year(r.horaRegistro) = :anyo "
			+ "group by month(r.horaRegistro) "
			+ "order by month(r.horaRegistro)")
	public List<Double[]> getPesoMedioAnyo(String dni, int anyo);
}
