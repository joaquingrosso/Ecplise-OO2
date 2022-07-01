package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {


	Biblioteca bilBiblioteca;
	VoorheesExporter exporter;
	Socio socio;
	
	@BeforeEach
	void setUp () {
		bilBiblioteca = new Biblioteca();
		exporter = new VoorheesExporter();
		socio = new Socio("felipe","felipe","515418498");
		bilBiblioteca.setExporter(exporter);
		bilBiblioteca.agregarSocio(socio);
	}
	
	@Test
	public void exportarTest() {
//		assertEquals("[\n"
//				+ "    {\n"
//				+ "   	 \"nombre\": \"Arya Stark\",\n"
//				+ "   	 \"email\": \"needle@stark.com\",\n"
//				+ "   	 \"legajo\": \"5234-5\"\n"
//				+ "    },\n"
//				+ "    {\n"
//				+ "   	 \"nombre\": \"Tyron Lannister\",\n"
//				+ "   	 \"email\": \"tyron@thelannisters.com\",\n"
//				+ "   	 \"legajo\": \"2345-2\"\n"
//				+ "    }\n"
//				+ "]\n"
//				+ "", bilBiblioteca.exportarSocios());

	}
	
}
