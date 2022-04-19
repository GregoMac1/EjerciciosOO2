package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorNombre extends FileDecorator{
	
	public DecoratorNombre(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getNombre();
	}
}
