package ar.edu.unlp.info.oo2.p4ej2;

public class DecoratorExtension extends FileDecorator{
	
	public DecoratorExtension(File component) {
		super(component);
	}
	
	@Override
	public String print() {
		return this.component.getExtension();
	}
}
