package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorFechaModificacion extends FileDecorator{
	
	public DecoratorFechaModificacion(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getFechaModificacion().toString();
	}
}
