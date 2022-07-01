package ar.edu.unlp.info.oo2.ejeCalcularSueldo;

public class Temporario extends Empleado{
	private int horasDeTrabajo;

	

	public Temporario(boolean estaCasado, int hijos, int horasDeTrabajo) {
		super(estaCasado,hijos);
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}



	@Override
	public double calcularBasico() {
		return (20000 + (this.getHorasDeTrabajo() * 300));
	}

	@Override
	public double calcularAdicional() {
		double resultado = this.getHijos() * this.precioPorHijo();
		if (this.isEstaCasado()) {
			resultado += this.precioPorEstarCasado();
		}
		
		return resultado; 
	}





}
