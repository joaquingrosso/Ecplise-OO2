package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class JsonExporterAdapter implements Exporter{
	private JsonExporter jsonExporter;
	
	
	
	@Override
	public String exportar(List<Socio> socios) {
		return this.jsonExporter.exportar(socios);
	}
	
}
