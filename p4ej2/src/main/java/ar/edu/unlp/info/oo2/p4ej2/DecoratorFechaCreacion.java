package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorFechaCreacion extends FileDecorator{
	
	public DecoratorFechaCreacion(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getFechaCreacion().toString();
	}
}
