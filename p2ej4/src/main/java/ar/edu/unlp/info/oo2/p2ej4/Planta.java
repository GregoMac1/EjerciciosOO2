package ar.edu.unlp.info.oo2.p2ej4;

public class Planta extends Empleado{
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		return (this.estaCasado ? 5000 : 0) + 2000 * this.cantHijos + 
				2000 * this.cantAnos;
	}
	
	public double descuento() {
		return this.basico() * 0.13 + this.adicional() * 0.05;
	}
}
