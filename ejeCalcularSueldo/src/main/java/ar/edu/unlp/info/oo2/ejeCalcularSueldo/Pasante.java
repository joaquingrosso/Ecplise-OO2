package ar.edu.unlp.info.oo2.ejeCalcularSueldo;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	


	public Pasante(int examenesRendidos) {
		super();
		this.examenesRendidos = examenesRendidos;
	}

	
	public int getExamenesRendidos() {
		return examenesRendidos;
	}
	@Override
	public double calcularBasico() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public double calcularAdicional() {
		// TODO Auto-generated method stub
		return 2000 * this.getExamenesRendidos();
	}

}
