package com.sinensia.gestionpacientes.backend.integration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REGISTROS")
public class RegistroPL {

	@Id
	@TableGenerator(name = "GENERADOR_REGISTROS",
		table = "SECUENCIAS",
		pkColumnName = "NOMBRE_SECUENCIA",
		pkColumnValue = "REGISTROS_SEQ",
		valueColumnName = "VALOR_SECUENCIA",
		allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "GENERADOR_REGISTROS")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="DNI_USUARIO")
	private UsuarioPL usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaRegistro;
	
	private double longitud;
	private double latitud;
	private double peso;
	private int presionMaxima;
	private int presionMinima;
	private Integer pasos;

	public RegistroPL() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuarioPL getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioPL usuario) {
		this.usuario = usuario;
	}

	public Date getHoraRegistro() {
		return horaRegistro;
	}

	public void setHoraRegistro(Date horaRegistro) {
		this.horaRegistro = horaRegistro;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPresionMaxima() {
		return presionMaxima;
	}

	public void setPresionMaxima(int presionMaxima) {
		this.presionMaxima = presionMaxima;
	}

	public int getPresionMinima() {
		return presionMinima;
	}

	public void setPresionMinima(int presionMinima) {
		this.presionMinima = presionMinima;
	}

	public Integer getPasos() {
		return pasos;
	}

	public void setPasos(Integer pasos) {
		this.pasos = pasos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroPL other = (RegistroPL) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroPL [id=" + id + ", usuario=" + usuario + ", horaRegistro=" + horaRegistro + ", longitud="
				+ longitud + ", latitud=" + latitud + ", peso=" + peso + ", presionMaxima=" + presionMaxima
				+ ", presionMinima=" + presionMinima + ", pasos=" + pasos + "]";
	}

}
