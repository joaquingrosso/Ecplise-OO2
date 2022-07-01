package ar.edu.unlp.info.oo2.ejeDispositivo;

public class Connection4gAdapter implements Connection{
	private Connection4g connection4g = new Connection4g();

	
	
	public Connection4g getConnection4g() {
		return connection4g;
	}
	
//	public Connection4gAdapter() {
//		this.connection4g = new Connection4g();
//	}
//	






	@Override
	public String pict() {
		return this.getConnection4g().symb();
	}

	@Override
	public String sendData(String data, long crc) {
		return this.getConnection4g().transmit(data,crc);
	}

}
