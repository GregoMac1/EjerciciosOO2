package ar.edu.unlp.info.oo2.p5ej1;

import java.util.ArrayList;
import java.util.List;

public class SpOOtify {
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Autor> autores = new ArrayList<>();
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void agregarAutor(Autor a) {
		this.autores.add(a);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	
	private List<Cancion> getCancionesDeAutores(List<Autor> autores, String nombre) {
		List<Cancion> aux = new ArrayList<Cancion>();
		for (Autor autor : autores) {
			aux.addAll(autor.buscarPorTitulo(nombre));
		}
		return aux;
	}

	public List<Cancion> buscarPorTitulo(String nombre) {
		return this.getCancionesDeAutores(autores, nombre);
	}
	
	public List<Cancion> buscarPorAutor(String nombre) {
		List<Autor> aux = this.autores.stream().
				filter(a -> a.getNombre().toLowerCase().
						contains(nombre.toLowerCase())).
				toList();
		return this.getCancionesDeAutores(aux, nombre);
	}
	
	public List<Cancion> buscarPorAlbum(String nombre) {
		List<Cancion> aux = new ArrayList<Cancion>();
		for (Autor autor : autores) {
			aux.addAll(autor.buscarPorAlbum(nombre));
		}
		return aux;
	}
}
