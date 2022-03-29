package ar.edu.unlp.info.oo2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.stylesheets.MediaList;

public class MediaPlayer {
	//private List<Media> mediaList = new ArrayList<Media>();
	
	public static void main(String[] args) {
		List<Media> mediaList = new ArrayList<Media>();
		mediaList.add(new Audio());
		mediaList.add(new VideoFile());
		mediaList.add(new VideoStreamAdapter());
		for (Media media : mediaList) {
			media.play();
		}
	}
}
