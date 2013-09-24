package br.com.bridgepattern.concrete;

import br.com.bridgepattern.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle [ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}


}
