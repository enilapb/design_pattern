package br.com.adapterpattern.main;

import br.com.adapterpattern.mediaplayer.AudioPlayer;

public class AdapterPatternDemo {
	
	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far way.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
