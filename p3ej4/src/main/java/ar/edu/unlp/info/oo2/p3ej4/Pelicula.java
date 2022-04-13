package ar.edu.unlp.info.oo2.p3ej4;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anoDeEstreno;
	private double puntaje;
	private List<Pelicula> similares = new ArrayList<Pelicula>();
	
	public void agregarSimilar(Pelicula p) {
		if (!this.similares.contains(p)) {
			this.similares.add(p);
			p.agregarSimilar(this);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}
}
