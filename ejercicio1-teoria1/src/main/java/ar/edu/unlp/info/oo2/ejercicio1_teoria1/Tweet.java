package ar.edu.unlp.info.oo2.ejercicio1_teoria1;

public class Tweet {
	private Tweet tweetOrigen = null;
	private String texto;
	private Usuario usuario;
	
	
	public Tweet(Usuario usuario, String texto) {
		this.usuario = usuario;
		this.texto = texto;
	}
	
	
	public Tweet(Usuario usuario, String texto, Tweet origen) {
		this(usuario, texto);
		if(origen != null) {
			this.tweetOrigen = origen;
		}		
	}
	

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}
}
