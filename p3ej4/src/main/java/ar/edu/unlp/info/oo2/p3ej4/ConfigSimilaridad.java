package ar.edu.unlp.info.oo2.p3ej4;

import java.util.ArrayList;
import java.util.List;

public class ConfigSimilaridad implements ConfigDeRecom{
	@Override
	public List<Pelicula> getSugerencias(Decodificador d) {
		List<Pelicula> similares = new ArrayList<Pelicula>();
		for (Pelicula pelicula : d.getPeliculasQueReprodujo()) {
			for (Pelicula pelicula2 : pelicula.getSimilares()) {
				if (!similares.contains(pelicula2))
					similares.add(pelicula2);
			}
		}
		return similares.stream().
				filter(p -> !d.getPeliculasQueReprodujo().contains(p)).
				toList().
				subList(0, 3);
	}
}
