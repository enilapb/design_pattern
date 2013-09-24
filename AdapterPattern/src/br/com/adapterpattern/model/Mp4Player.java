package br.com.adapterpattern.model;

import br.com.adapterpattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//doNothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name : " + fileName);
	}

	
}
