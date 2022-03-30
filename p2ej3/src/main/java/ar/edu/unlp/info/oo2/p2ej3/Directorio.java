package ar.edu.unlp.info.oo2.p2ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements Estructura{
	private String nombre;
	private LocalDate fecha;
	private List<Estructura> estructuras = new ArrayList<Estructura>();
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public void agregar(Estructura e) {
		this.estructuras.add(e);
	}
	
	public boolean esArchivo() {
		return false;
	}
	
	public int getTamano() {
		return 32;
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamano() + this.estructuras.stream().
				mapToInt(e -> e.getTamano()).
				sum();
	}
	
	public Archivo archivoMasGrande() {
		return this.estructuras.stream().
				filter(e -> e.esArchivo()).
				max((Archivo a1, Archivo a2) -> a1.getTamano() > a2.getTamano()).
				orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
}
