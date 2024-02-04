package com.mario.proyect.jugador;

import com.mario.proyect.equipo.Equipo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    private String dni;
    private String nombre;
    private String numeroSeguro;
    private String tallaCamiseta;
    private boolean Portero;

	@ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroSeguro() {
		return numeroSeguro;
	}
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}
	public String getTallaCamiseta() {
		return tallaCamiseta;
	}
	public void setTallaCamiseta(String tallaCamiseta) {
		this.tallaCamiseta = tallaCamiseta;
	}
	public boolean isPortero() {
		return Portero;
	}
	public void setPortero(boolean portero) {
		Portero = portero;
	}
   	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + "]";
	}
}
