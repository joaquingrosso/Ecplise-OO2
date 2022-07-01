package ar.edu.unlp.info.oo2.ejercicio1_teoria1;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    

    public Usuario agregarUsuario( String screenName) {
        if ( !validarExistenciaUsuario(screenName) ) {
        	Usuario usuAux = new Usuario(screenName);
        	this.usuarios.add( usuAux );
        	return usuAux;
        } else {
        	return null;
        }           
    }
    
    public Boolean eliminarUsuario( String screenName) {
        if ( !validarExistenciaUsuario(screenName) ) {
        	Usuario usuAux = new Usuario(screenName);
        	this.usuarios.remove( usuAux );
        	return true;
        } else {
        	return false;
        }           
    }
        
    
    private Boolean validarExistenciaUsuario(String nombre){
    	for(int i = 0; i < this.usuarios.size(); i++) {
    		if( nombre == this.usuarios.get(i).getScreenName()) {
    			return true;
    		}
    	}
    	return false;
    }    
    
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public ArrayList<Tweet> getTweets(){
    	ArrayList<Tweet> tweets = new ArrayList<Tweet>() ;
    	for (int i = 0; i < this.usuarios.size(); i++) {
    		tweets.addAll( this.usuarios.get(i).getTweets() );
    	}
    	return tweets;
    }
    
    
}
