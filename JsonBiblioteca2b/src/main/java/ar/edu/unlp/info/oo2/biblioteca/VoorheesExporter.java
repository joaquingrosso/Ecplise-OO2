package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class VoorheesExporter {
	private JsonExporterAdapter adapter = new JsonExporterAdapter();

	public String exportar(List<Socio> socios) {
		return this.adapter.exportar(socios);
	}
}
