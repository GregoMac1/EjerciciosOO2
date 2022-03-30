package ar.edu.unlp.info.oo2.p2ej3;

import java.time.LocalDate;

public class Archivo implements Estructura{
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public boolean esArchivo() {
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getTamano() {
		return tamano;
	}
}
