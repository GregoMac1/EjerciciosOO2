package ar.edu.unlp.info.oo2.ejercicio3;

public class VideoStreamAdapter implements Media {
	private VideoStream stream = new VideoStream();
	
	public void play() {
		stream.reproduce();
	}
}
