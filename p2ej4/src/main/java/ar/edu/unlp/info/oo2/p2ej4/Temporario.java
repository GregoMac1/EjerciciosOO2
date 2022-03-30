package ar.edu.unlp.info.oo2.p2ej4;

public class Temporario extends Empleado{
	public double basico() {
		return 20000 + this.cantHoras * 300;
	}
	
	public double adicional() {
		return (this.estaCasado ? 5000 : 0) + 2000 * this.cantHijos;
	}
	
	public double descuento() {
		return this.basico() * 0.13 + this.adicional() * 0.05;
	}
}
