package ar.edu.unlp.info.oo2.ejeCalcularSueldo;

public class Planta extends Empleado{
	private int antiguedad;
	
	
	
	public Planta(boolean estaCasado, int hijos,int antiguedad) {
		super(estaCasado,hijos);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	@Override
	public double calcularBasico() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public double calcularAdicional() {
		double resultado = getHijos()*this.precioPorHijo();
		resultado += getAntiguedad()*this.precioPorAntiguadad();
		if (this.isEstaCasado()) {
			resultado += this.precioPorEstarCasado();
		}
		
		return resultado;
	}

	

	
	private double precioPorAntiguadad() {
		return 2000;
	}
}
