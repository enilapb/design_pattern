package br.com.adapterpattern.mediaplayer;

import br.com.adapterpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name : " + fileName);
		} else if(audioType.endsWith("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else{
			System.out.println("Invalid Media. " + audioType + " format not supported.");
		}
	}
	

}
