package ar.edu.unlp.info.oo2.p2ej1;

import java.util.ArrayList;
import java.util.List;

public class ServicioTopografias {
	private List<Topografia> topografias = new ArrayList<>();
	
	public void crearTopografiaSimple() {
		
	}
	
	public void crearTopografiaMixta() { 
		Topografia t = new TopografiaMixta();
		this.topografias.add(t);
	}
	
	public double getProporcion(Topografia t) {
		return t.getProporcion();
	}
	
	public boolean equals (Topografia t1, Topografia t2) {
		return t1.equals(t2);
	}
}
