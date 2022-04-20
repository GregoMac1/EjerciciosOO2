package ar.edu.unlp.info.oo2.p5ej1;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	private String nombre;
	private List<Album> albumes = new ArrayList<>();
	
	public Autor(String nombre, List<Album> albumes) {
		super();
		this.nombre = nombre;
		this.albumes = albumes;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Album> getAlbumes() {
		return albumes;
	}
	
	public List<Cancion> buscarPorTitulo(String nombre) {
		List<Cancion> aux = new ArrayList<Cancion>();
		for (Album album : albumes) {
			aux.addAll(album.buscarPorTitulo(nombre));
		}
		return aux;
	}
	
	public List<Cancion> buscarPorAlbum(String nombre) {
		List<Album> auxAlbumes = this.albumes.stream().
				filter(a -> a.getNombre().toLowerCase().
						contains(nombre.toLowerCase())).
				toList();
		List<Cancion> aux = new ArrayList<Cancion>();
		for (Album album : auxAlbumes) {
			aux.addAll(album.buscarPorTitulo(nombre));
		}
		return aux;
	}
}
