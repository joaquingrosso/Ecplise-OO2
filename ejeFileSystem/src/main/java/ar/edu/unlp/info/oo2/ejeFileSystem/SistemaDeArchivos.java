package ar.edu.unlp.info.oo2.ejeFileSystem;

import java.time.LocalDate;

public abstract class SistemaDeArchivos {
	String nombre;
	LocalDate fecha;
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public SistemaDeArchivos(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public abstract int tamanoTotalOcupado();

	public  abstract Archivo archivoMasGrande();

	public abstract Archivo archivoMasNuevo();
	
	

}
