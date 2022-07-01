package ar.edu.unlp.info.oo2.ejeFileSystem;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends SistemaDeArchivos{
	final int tamano = 32;
	private List<SistemaDeArchivos> archivos = new ArrayList<SistemaDeArchivos>();
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
	}

	public int tamanoTotalOcupado() {
		return this.tamano + this.archivos.stream()
				.mapToInt(arc -> arc.tamanoTotalOcupado())
				.sum();
	}
	
	

	public void agregar(SistemaDeArchivos archivo) {
		this.archivos.add(archivo);
		
	}


	public Archivo archivoMasGrande() {
		
		return this.archivos.stream()
			.map(arc -> arc.archivoMasGrande())
			.max(Comparator.comparing(Archivo::tamanoTotalOcupado)).orElse(null);
	}


	@Override
	public Archivo archivoMasNuevo() {
		return this.archivos.stream()
				.map(arc -> arc.archivoMasNuevo())
				.max(Comparator.comparing(Archivo::getFecha)).orElse(null);
		
	}
	
}
