package ar.edu.unlp.info.oo2.p3ej4;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> peliculasTodas = new ArrayList<Pelicula>();
	private List<Pelicula> peliculasQueReprodujo = new ArrayList<Pelicula>();
	private ConfigDeRecom config;

	public void setConfig(ConfigDeRecom config) {
		this.config = config;
	}
	
	public List<Pelicula> getSugerencias() {
		return this.config.getSugerencias(this);
	}

	public List<Pelicula> getPeliculasTodas() {
		return peliculasTodas;
	}

	public List<Pelicula> getPeliculasQueReprodujo() {
		return peliculasQueReprodujo;
	}
}
