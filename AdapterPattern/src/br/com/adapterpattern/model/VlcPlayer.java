package br.com.adapterpattern.model;

import br.com.adapterpattern.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//doNothing
	}

}
