package com.mario.proyect.equipo;

import java.util.List;

import com.mario.proyect.categoria.Categoria;
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
    private int numeroJugadores;
    private int puntos;
    private int golesFavor;
    private int golesContra;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    
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

	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
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

	@Override
    public String toString() {
        return "Equipo [id=" + id + ", nombre=" + nombre + "]";
    }
}
