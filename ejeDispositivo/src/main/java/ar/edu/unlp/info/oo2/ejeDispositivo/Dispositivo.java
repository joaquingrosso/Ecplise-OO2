package ar.edu.unlp.info.oo2.ejeDispositivo;

public class Dispositivo {
	private Connection connection;
	private CRC_Calculator crcCalculator;
	private Ringer ringer;
	private Display display;
	
	
	
	public Dispositivo(Connection connection, CRC_Calculator crcCalculator, Ringer ringer, Display display) {
		super();
		this.connection = connection;
		this.crcCalculator = crcCalculator;
		this.ringer = ringer;
		this.display = display;
	}


	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}

	public Connection getConnection() {
		return connection;
	}



	public CRC_Calculator getCrcCalculator() {
		return crcCalculator;
	}



	public Ringer getRinger() {
		return ringer;
	}



	public Display getDisplay() {
		return display;
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}



	public void setCrcCalculator(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}



	public void setRinger(Ringer ringer) {
		this.ringer = ringer;
	}



	public void setDisplay(Display display) {
		this.display = display;
	}



	public String changeConnection( Connection conecction) {
		this.setConnection(conecction);
		return this.display.showBanner(this.connection.pict()) + this.ringer.ringer();
		
	}
	
	
	
	
	
}
