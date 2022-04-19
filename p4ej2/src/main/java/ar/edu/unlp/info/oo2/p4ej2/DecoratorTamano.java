package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorTamano extends FileDecorator{
	
	public DecoratorTamano(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getTamano().toString();
	}
}
