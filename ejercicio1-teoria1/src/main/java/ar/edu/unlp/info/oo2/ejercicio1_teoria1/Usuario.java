package ar.edu.unlp.info.oo2.ejercicio1_teoria1;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
    public Usuario(String screenName) {
        this.screenName = screenName;        
    }
    
    
    public ArrayList<Tweet> getTweets(){
    	return tweets;
    }   
    
    
    public String getScreenName() {
		return screenName;
	}     
    
    
    public Boolean postearTweet(String texto, Tweet origen) {
    	if (this.validarLongitudTexto(texto)) {
        	this.tweets.add(new Tweet(this, texto, origen));        	
    		return true;
    	}else {
    		return false;
    	}    	
    }
    
    
    private Boolean validarLongitudTexto(String texto) {
    	return (1 <= texto.length()) && (140 <= texto.length());
    }
       
}


