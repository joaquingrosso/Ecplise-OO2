package ar.edu.unlp.info.oo2.ejeFileSystem;

import java.time.LocalDate;

public class Archivo extends SistemaDeArchivos{
	int size;
	



	public Archivo (String nombre, LocalDate fecha, int size) {
		super(nombre, fecha);
		this.size = size;
	}




	@Override
	public int tamanoTotalOcupado() {
		// TODO Auto-generated method stub
		return size;
	}




	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return this;
	}




	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this;
	}





	
	
}
