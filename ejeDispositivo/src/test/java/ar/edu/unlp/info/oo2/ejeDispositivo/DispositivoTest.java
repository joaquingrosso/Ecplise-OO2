package ar.edu.unlp.info.oo2.ejeDispositivo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	
	Dispositivo dispositivo;
	CRC16_Calculator crc16_Calculator;
	CRC32_Calculator crc32_Calculator;
	ConnectionWifi connectionWifi;
	Connection4gAdapter connection4gAdapter;
	Ringer ringer;
	Display display;
	
	
	@BeforeEach
	 void setUp() {
		connection4gAdapter = new Connection4gAdapter();

		crc16_Calculator = new CRC16_Calculator();
		display = new Display();
		ringer = new Ringer();
		dispositivo = new Dispositivo(connection4gAdapter, crc16_Calculator, ringer, display);

		
	}
	
	@Test
	public void send() {
		//Prueba con 4g
		assertEquals("felipe49442",dispositivo.send("felipe"));
		dispositivo.setCrcCalculator(new CRC32_Calculator());
		assertEquals("felipe447537644",dispositivo.send("felipe"));
		
		//Prueba con wifi
		dispositivo.changeConnection(new ConnectionWifi());
		assertEquals("felipe447537644",dispositivo.send("felipe"));
		dispositivo.setCrcCalculator(new CRC16_Calculator());
		assertEquals("felipe49442",dispositivo.send("felipe"));
		
	}

	@Test 
	public void conectarCon() {
		assertEquals("Estoy usando wifi.Ring Ring",dispositivo.changeConnection(new ConnectionWifi()));
		assertEquals("Estoy usando 4g.Ring Ring",dispositivo.changeConnection(new Connection4gAdapter()));
		
	}
	
	@Test 
	public void configurarCRC(){
		
	}
	

	

}
