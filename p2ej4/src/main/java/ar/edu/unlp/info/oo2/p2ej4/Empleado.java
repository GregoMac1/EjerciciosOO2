package ar.edu.unlp.info.oo2.p2ej4;

public abstract class Empleado {
	protected int cantHoras;
	protected int cantAnos;
	protected boolean estaCasado;
	protected int cantHijos;
	protected int cantExamenes;
	
	public abstract double basico();
	
	public abstract double adicional();
	
	public abstract double descuento();
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
}
