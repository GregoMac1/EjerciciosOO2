package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuarios {
	private List<Usuario> usuarios = new ArrayList<>();
	
	private boolean nombreDisponible(String screenName) {
		return !this.usuarios.stream().
				anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	public Usuario registrarUsuario(String screenName) {
		if (nombreDisponible(screenName)) {
			Usuario u = new Usuario(screenName);
			this.usuarios.add(u);
			return u;
		}
		return null;
	}
	
	public void eliminarUsuario(Usuario u) {
		u.eliminarTweets();
		this.usuarios.remove(u);
	}
}
