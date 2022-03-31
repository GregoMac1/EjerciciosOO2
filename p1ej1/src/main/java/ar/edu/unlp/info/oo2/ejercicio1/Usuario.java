package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets = new ArrayList<>();
	
	public Usuario(String screenName) {
		this.screenName = screenName;
	}
	
	public Tweet crearTweet(String texto) {
		if (texto.length() > 0 && texto.length() <= 140) {
			Tweet t = new Tweet(texto);
			this.tweets.add(t);
			return t;
		} else return null;
	}
	
	public Tweet hacerRetweet(String texto, Tweet origen) {
		Tweet t = new Tweet(texto, origen);
		origen.agregarRetweeteado(t);
		this.tweets.add(t);
		return t;
	}
	
	public void eliminarTweets() {
		for (Tweet tweet : tweets) {
			tweet.eliminarRetweeteados();
		}
		this.tweets.clear();
	}

	public String getScreenName() {
		return screenName;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}
}
