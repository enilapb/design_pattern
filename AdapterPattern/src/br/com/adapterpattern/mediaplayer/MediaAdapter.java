package br.com.adapterpattern.mediaplayer;

import br.com.adapterpattern.interfaces.AdvancedMediaPlayer;
import br.com.adapterpattern.interfaces.MediaPlayer;
import br.com.adapterpattern.model.Mp4Player;
import br.com.adapterpattern.model.VlcPlayer;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		} else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		} else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
