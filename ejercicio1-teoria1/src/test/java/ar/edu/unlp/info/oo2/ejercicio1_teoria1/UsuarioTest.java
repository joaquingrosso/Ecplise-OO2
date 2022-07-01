package ar.edu.unlp.info.oo2.ejercicio1_teoria1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

	Usuario usu1;
	Usuario usu2;
	boolean twtVerdadero;
	boolean twtFalso1;
	boolean twtFalso2;
	

	@BeforeEach
	void setUp() throws Exception {
		usu1 = new Usuario("Glossing, James");
		usu2 = new Usuario("van Rossum, Guido");
		
		twtVerdadero = usu1.postearTweet("Hola", null);
		twtFalso1 	 = usu2.postearTweet("", null);
		twtFalso2 	 = usu2.postearTweet("Durante la visita, que se gestó por especial requerimiento de la dirigencia del CULP,"
				+ "la UNLP se comprometió a generar mecanismos de cooperación y asesoramiento principalmente en la puesta en marcha"
				+ " del secundario del Club Universitario El presidente de la Universidad Nacional de La Plata, Fernando Tauber, recibió"
				+ " al titular de la fundación y actual secretario General del Club Universitario de La Plata (CULP), Marcelo Galland,"
				+ " quien estuvo acompañado por el coordinador general del proyecto educativo, Ignacio De Carli."
				, null);
	}
	
	@Test
	public void testTweets() {
    	assertTrue( twtVerdadero);
    	assertFalse( twtFalso1);
    	assertFalse( twtFalso2);
    }
	
    @Test
    public void testNombre() {
    	assertEquals("Glossing, James", usu1.getScreenName());  	
    }
    
    
	
	
	
	
	
	
}
