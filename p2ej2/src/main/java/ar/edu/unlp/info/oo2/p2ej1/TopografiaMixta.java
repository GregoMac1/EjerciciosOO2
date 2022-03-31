package ar.edu.unlp.info.oo2.p2ej1;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta  implements Topografia{
	private List<Topografia> partes = new ArrayList<>(4);	
	
	public TopografiaMixta(List<Topografia> partes) {
		this.partes = partes;
	}

	public static Topografia crearTopografia(List<Topografia> partes) {
		return new TopografiaMixta(partes);
	}
	
	public double getProporcion() {
		return this.partes.stream().
				mapToDouble(p -> p.getProporcion()).
				sum() / 4;
	}
}
