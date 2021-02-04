package com.sinensia.gestionpacientes.backend.integration.model;

import java.util.Date;

public class RegistroPL {

	private int id;
	private String dni_usuario;
	private Date hora_registro;
	private double longitud;
	private double latitud;
	private double peso;
	private int presion_maxima;
	private int presion_minima;
	private int pasos;
	
	public RegistroPL() {
	}

	public RegistroPL(int id, String dni_usuario, Date hora_registro, double longitud, double latitud, double peso,
			int presion_maxima, int presion_minima, int pasos) {
		this.id = id;
		this.dni_usuario = dni_usuario;
		this.hora_registro = hora_registro;
		this.longitud = longitud;
		this.latitud = latitud;
		this.peso = peso;
		this.presion_maxima = presion_maxima;
		this.presion_minima = presion_minima;
		this.pasos = pasos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public Date getHora_registro() {
		return hora_registro;
	}

	public void setHora_registro(Date hora_registro) {
		this.hora_registro = hora_registro;
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

	public int getPresion_maxima() {
		return presion_maxima;
	}

	public void setPresion_maxima(int presion_maxima) {
		this.presion_maxima = presion_maxima;
	}

	public int getPresion_minima() {
		return presion_minima;
	}

	public void setPresion_minima(int presion_minima) {
		this.presion_minima = presion_minima;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("RegistroPL [id=");
		builder.append(id);
		builder.append(", dni_usuario=");
		builder.append(dni_usuario);
		builder.append(", hora_registro=");
		builder.append(hora_registro);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", presion_maxima=");
		builder.append(presion_maxima);
		builder.append(", presion_minima=");
		builder.append(presion_minima);
		builder.append(", pasos=");
		builder.append(pasos);
		builder.append("]");
		return builder.toString();
	}

}
