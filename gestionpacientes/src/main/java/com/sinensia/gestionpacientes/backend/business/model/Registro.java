package com.sinensia.gestionpacientes.backend.business.model;

import java.util.Date;

public class Registro {

	private int id;
<<<<<<< Updated upstream
	private Usuario dniUsuario;
=======
	private Usuario usuario;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
	public Usuario getDni_usuario() {
		return usuario;
	}

	public void setDni_usuario(Usuario dni_usuario) {
		this.usuario = dni_usuario;
	}

	public Date getHora_registro() {
		return horaRegistro;
	}

	public void setHora_registro(Date hora_registro) {
		this.horaRegistro = hora_registro;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
	public int getPresion_maxima() {
		return presionMaxima;
	}

	public void setPresion_maxima(int presion_maxima) {
		this.presionMaxima = presion_maxima;
	}

	public int getPresion_minima() {
		return presionMinima;
	}

	public void setPresion_minima(int presion_minima) {
		this.presionMinima = presion_minima;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		return "Registro [id=" + id + ", dniUsuario=" + dniUsuario + ", horaRegistro=" + horaRegistro + ", longitud="
				+ longitud + ", latitud=" + latitud + ", peso=" + peso + ", presionMaxima=" + presionMaxima
				+ ", presionMinima=" + presionMinima + ", pasos=" + pasos + "]";
=======
		return "Registros [id=" + id + ", usuario=" + usuario + ", horaRegistro=" + horaRegistro
				+ ", longitud=" + longitud + ", latitud=" + latitud + ", peso=" + peso + ", presionMaxima="
				+ presionMaxima + ", presionMinima=" + presionMinima + ", pasos=" + pasos + "]";
>>>>>>> Stashed changes
	}
}
