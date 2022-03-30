package ar.edu.unlp.info.oo2.p2ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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
		return (Archivo)this.estructuras.stream().
				filter(e -> e.esArchivo()).
				max(Comparator.comparing(Estructura::getTamano)).
				orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return (Archivo)this.estructuras.stream().
				filter(e -> e.esArchivo()).
				max(Comparator.comparing(Estructura::getFecha)). //no me acuerdo como se comparaban fechas
				orElse(null);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
}
