package br.com.bridgepattern.concrete;

import br.com.bridgepattern.interfaces.DrawAPI;

public abstract class Shape {

	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
