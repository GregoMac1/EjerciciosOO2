package ar.edu.unlp.info.oo2.p5ej1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Cancion> listaMyMusic = new ArrayList<>();
	
	public void agregarAMyMusic(Cancion c) {
		this.listaMyMusic.add(c);
	}
	
	public void eliminarDeMyMusic(Cancion c) {
		this.listaMyMusic.remove(c);
	}
}
