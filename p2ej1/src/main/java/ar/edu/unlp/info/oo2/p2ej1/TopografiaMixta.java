package ar.edu.unlp.info.oo2.p2ej1;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta  implements Topografia{
	private List<Topografia> partes = new ArrayList<>(4);
	
	public double getProporcion() {
		return this.partes.stream().
				mapToDouble(p -> p.getProporcion()).
				sum() / 4;
	}
}
