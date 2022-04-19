package ar.edu.unlp.info.oo2.p4ej2;

import java.time.LocalDate;

public abstract class FileDecorator implements File{
	protected File component;
	
	public FileDecorator(File component) {
		super();
		this.component = component;
	}

	public abstract String print();
	
	@Override
	public String prettyPrint() {
		if (this.component.prettyPrint() != "") {
			return this.print() + " - " + this.component.prettyPrint();
		}
		return this.print();
	}
	
	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public Double getTamano() {
		return this.component.getTamano();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}
}
