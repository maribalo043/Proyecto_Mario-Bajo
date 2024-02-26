package com.mario.proyect.equipo;

import java.util.List;

import com.mario.proyect.categoria.Categoria;
import com.mario.proyect.juega.Juega;
import com.mario.proyect.jugador.Jugador;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String emailContacto;
    private int numeroTelefonoContacto;

	@OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
    private Categoria categoria;
	
	@OneToMany(mappedBy = "equipo", cascade = CascadeType.REMOVE)
    private List<Juega> juegas;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmailContacto() {
		return emailContacto;
	}
	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}
	public int getNumeroTelefonoContacto() {
		return numeroTelefonoContacto;
	}
	public void setNumeroTelefonoContacto(int numeroTelefonoContacto) {
		this.numeroTelefonoContacto = numeroTelefonoContacto;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Juega> getJuegas() {
        return juegas;
    }

    public void setJuegas(List<Juega> juegas) {
        this.juegas = juegas;
    }
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + "]";
	}  
}
