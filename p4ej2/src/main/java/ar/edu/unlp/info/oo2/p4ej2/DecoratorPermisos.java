package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorPermisos extends FileDecorator{
	
	public DecoratorPermisos(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getPermisos();
	}
}
