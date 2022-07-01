package ar.edu.unlp.info.oo2.ejeDispositivo;

public class ConnectionWifi implements Connection{
	private String pict = "Estoy usando wifi";

	


	@Override
	public String pict() {
		// TODO Auto-generated method stub
		return pict;
	}

	@Override
	public String sendData(String data, long crc) {
		// TODO Auto-generated method stub
		return data + crc;
	}
	
	
	
	
}
