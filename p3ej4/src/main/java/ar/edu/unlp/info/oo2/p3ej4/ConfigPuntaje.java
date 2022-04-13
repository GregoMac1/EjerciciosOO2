package ar.edu.unlp.info.oo2.p3ej4;

import java.util.List;

public class ConfigPuntaje implements ConfigDeRecom{
	@Override
	public List<Pelicula> getSugerencias(Decodificador d) {
		return d.getPeliculasTodas().stream().
				filter(p -> !d.getPeliculasQueReprodujo().contains(p)).
				sorted((p1, p2) -> p1.getPuntaje()).
				toList().
				subList(0, 3);
	}
}
