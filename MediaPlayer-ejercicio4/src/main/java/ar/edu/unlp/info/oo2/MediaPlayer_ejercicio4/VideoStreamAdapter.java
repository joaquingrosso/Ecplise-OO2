package ar.edu.unlp.info.oo2.MediaPlayer_ejercicio4;

public class VideoStreamAdapter extends Media{

	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream unVS){
		this.videoStream = unVS;
	}
	
	public void play() {
		System.out.println("Adapting ........ ");
		this.videoStream.reproduce();
	}
	
}
