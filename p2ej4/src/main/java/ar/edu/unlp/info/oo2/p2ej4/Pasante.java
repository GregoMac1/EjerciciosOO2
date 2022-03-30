package ar.edu.unlp.info.oo2.p2ej4;

public class Pasante extends Empleado{
	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		return 2000 * this.cantExamenes;
	}
	
	public double descuento() {
		return this.basico() * 0.13 + this.adicional() * 0.05;
	}
}
