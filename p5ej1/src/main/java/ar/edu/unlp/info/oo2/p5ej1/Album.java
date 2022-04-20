package ar.edu.unlp.info.oo2.p5ej1;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private String nombre;
	private List<Cancion> canciones = new ArrayList<>();
	
	public Album(String nombre, List<Cancion> canciones) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}
	
	public List<Cancion> buscarPorTitulo(String nombre) {
		return this.canciones.stream().
				filter(c -> c.getNombre().toLowerCase().
						contains(nombre.toLowerCase())).
				toList();
	}
}
