package br.com.bridgepattern.main;

import br.com.bridgepattern.concrete.Circle;
import br.com.bridgepattern.concrete.GreenCircle;
import br.com.bridgepattern.concrete.RedCircle;
import br.com.bridgepattern.concrete.Shape;

public class BridgePatternDemo {
	
	public static void main(String[] args){
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greendCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greendCircle.draw();
	}

}
