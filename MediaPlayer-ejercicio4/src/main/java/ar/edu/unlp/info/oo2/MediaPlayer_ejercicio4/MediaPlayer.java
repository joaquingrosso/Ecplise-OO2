package ar.edu.unlp.info.oo2.MediaPlayer_ejercicio4;

public class MediaPlayer {
		
	public static void main(String[] args) {
		
		Media audio = new Audio();
		Media videoFile = new VideoFile();
		VideoStream vs = new VideoStream();
		Media VideoStream = new VideoStreamAdapter(vs);
		
		System.out.println("-------------------");
		audio.play();
		System.out.println("-------------------");
		videoFile.play();
		System.out.println("-------------------");
		VideoStream.play();
		System.out.println("-------------------");
		
	}
}

