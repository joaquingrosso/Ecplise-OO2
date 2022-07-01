package ar.edu.unlp.info.oo2.Encriptador;

public class ConexionSegura extends Conexion{
	 
	private Encriptador encriptador = new RC4();  //elijo una aleatoria
	
	public void enviar(String msj) {
		
		super.enviar( this.encriptador.encriptar( msj ) );
	}
}	
