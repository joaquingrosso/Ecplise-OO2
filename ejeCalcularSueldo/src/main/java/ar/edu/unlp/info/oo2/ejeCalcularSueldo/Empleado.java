package ar.edu.unlp.info.oo2.ejeCalcularSueldo;

public abstract class Empleado {
	private boolean estaCasado;
	private int hijos;

	public Empleado() {
		this.hijos = 0;
		this.estaCasado = false;
	}

	public Empleado(boolean estaCasado, int hijos) {
		this.estaCasado = estaCasado;
		this.hijos = hijos;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public int getHijos() {
		return hijos;
	}

	protected double precioPorHijo() {
		return 2000;
	}

	protected double precioPorEstarCasado() {
		return 5000;
	}

	public abstract double calcularBasico();

	public abstract double calcularAdicional();

	private double porcentajeSueldoBasico() {
		return 0.13;
	}

	private double porcentajeSueldoAdicional() {
		return 0.05;
	}

	public double calcularDescuento() {
		return (this.calcularBasico() * porcentajeSueldoBasico())
				+ (this.calcularAdicional() * porcentajeSueldoAdicional());
	}

	public double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}
}
