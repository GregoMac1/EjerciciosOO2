package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Tweet {
	private String texto;
	private Tweet origen;
	private List<Tweet> retweeteados = new ArrayList<Tweet>();
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	public Tweet(String texto, Tweet origen) {
		this.texto = texto;
		this.origen = origen;
	}
	
	public void agregarRetweeteado(Tweet tweet) {
		this.retweeteados.add(tweet);
	}
	
	public void eliminarRetweeteados() {
		for (Tweet tweet : retweeteados) {
			tweet.eliminarRetweeteados();
		}
		this.retweeteados.clear();
	}

	public String getTexto() {
		return texto;
	}

	public Tweet getOrigen() {
		return origen;
	}
}
