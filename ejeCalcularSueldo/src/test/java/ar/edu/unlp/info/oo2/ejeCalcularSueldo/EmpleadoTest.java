package ar.edu.unlp.info.oo2.ejeCalcularSueldo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Temporario tempo;
	Planta planta;
	Pasante pasante;
	
	@BeforeEach
	void setUp() throws Exception {
		tempo = new Temporario(true,2,7);
		planta = new Planta(false,0,50);
		pasante =  new Pasante(6);
	}
    @Test
    public void testSueldo() {
        assertEquals(27777,tempo.sueldo());
        assertEquals(28800,pasante.sueldo());
        assertEquals(138500,planta.sueldo());
       
        
    }
}
