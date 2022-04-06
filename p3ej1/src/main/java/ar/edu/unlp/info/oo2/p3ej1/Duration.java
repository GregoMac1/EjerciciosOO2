package ar.edu.unlp.info.oo2.p3ej1;

import java.time.LocalDateTime;

public class Duration {
	private LocalDateTime start, stop;
	
	public Duration() {
		this.start = LocalDateTime.now();
	}
	
	public void stop() {
		this.stop = LocalDateTime.now();
	}
	
	public double getDuracionEnSegundos() {
		return (double) java.time.Duration.
				between(start, stop).getSeconds();
	}
}
