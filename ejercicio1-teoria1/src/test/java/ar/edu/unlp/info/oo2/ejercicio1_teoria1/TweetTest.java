package ar.edu.unlp.info.oo2.ejercicio1_teoria1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	Usuario usu = new Usuario("Glossing, James");
	Tweet twt1;
	Tweet twt2;

	@BeforeEach
	void setUp() throws Exception {
		twt1 = new Tweet(usu,"hola");
		twt2 = new Tweet(usu,"chau",twt1);
	}
	
    @Test
    public void testUsuario() {
    	assertEquals("Glossing, James", twt1.getUsuario().getScreenName());    	 
    }
    
    @Test
    public void testTexto() {
    	assertEquals("hola", twt1.getTexto());
    	assertEquals("chau", twt2.getTexto());
    }
    
    @Test
    public void testTweet() {
    	assertEquals("hola", twt2.getTweetOrigen().getTexto());
    }
}
