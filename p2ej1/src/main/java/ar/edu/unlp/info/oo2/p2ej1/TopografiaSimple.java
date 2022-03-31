package ar.edu.unlp.info.oo2.p2ej1;

public abstract class TopografiaSimple implements Topografia{
	protected double proporcion;
	
	public double getProporcion() {
		return this.getProporcion();
	}
	
	public static Agua crearAgua() {
		return new Agua();
	}
	
	public static Tierra crearTierra() {
		return new Tierra();
	}
}
