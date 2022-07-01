package ar.edu.unlp.info.oo2.topografia_eje1y2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {

	
	Topografia topoA;
	Topografia topoT;
	Topografia topoP;
	
	Topografia topog1;
	Topografia topog2;
	
	Topografia topogEspejo2;
	Topografia topogEspejoMal;
	
	@BeforeEach
	void setUp(){
		
		topoA = new Agua();
		topoT = new Tierra();
		topoP = new Pantano();
		
		topog1 = new Mixta();
		topog2 = new Mixta();
		
		topogEspejo2 = new Mixta();
		topogEspejoMal = new Mixta();
		
		((Mixta) topog1).agregarTopografia( topoA );
		((Mixta) topog1).agregarTopografia( topoT );
		((Mixta) topog1).agregarTopografia( topoA );
		((Mixta) topog1).agregarTopografia( topoT );
		
		((Mixta) topog2).agregarTopografia( topoA );
		((Mixta) topog2).agregarTopografia( topoT );
		((Mixta) topog2).agregarTopografia( topoP );
		((Mixta) topog2).agregarTopografia( topoT );
		
		((Mixta) topogEspejo2).agregarTopografia( topoA );
		((Mixta) topogEspejo2).agregarTopografia( topoT );
		((Mixta) topogEspejo2).agregarTopografia( topoP );
		((Mixta) topogEspejo2).agregarTopografia( topoT );
		
		((Mixta) topogEspejoMal).agregarTopografia( topoA );
		((Mixta) topogEspejoMal).agregarTopografia( topoA );
		((Mixta) topogEspejoMal).agregarTopografia( topoP );
		((Mixta) topogEspejoMal).agregarTopografia( topoT );
		
		
	}
	
	@Test
	void test() {		
		
		assertEquals(0.5  , topog1.porcionDeAgua() );
		assertEquals(0.425, topog2.porcionDeAgua() );
		
		
		assertEquals(1,     topoA.porcionDeAgua());
		assertEquals(0,     topoT.porcionDeAgua());
		assertEquals(0.7,   topoP.porcionDeAgua());
		
		boolean iguales = ((Mixta) topog2).getTopografia().equals( ((Mixta) topogEspejo2).getTopografia() );
		boolean distintas = ((Mixta) topog2).getTopografia().equals( ((Mixta) topogEspejoMal).getTopografia() );
		
		assertEquals(true,  iguales);
		assertEquals(false, distintas);
	}

}
