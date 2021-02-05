package com.sinensia.gestionpacientes.backend.business.model;

import java.util.Date;

public class Registro {

	private int id;
	private Usuario dniUsuario;
	private Date horaRegistro;
	private double longitud;
	private double latitud;
	private double peso;
	private int presionMaxima;
	private int presionMinima;
	private Integer pasos;

	public Registro() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(Usuario dniUsuario) {
		this.dniUsuario = dniUsuario;
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
		Registro other = (Registro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Registro [id=" + id + ", dniUsuario=" + dniUsuario + ", horaRegistro=" + horaRegistro + ", longitud="
				+ longitud + ", latitud=" + latitud + ", peso=" + peso + ", presionMaxima=" + presionMaxima
				+ ", presionMinima=" + presionMinima + ", pasos=" + pasos + "]";
	}
}
