package ar.edu.unlp.info.oo2.p4ej2;

import java.time.LocalDate;

public interface File {
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public Double getTamano();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}
