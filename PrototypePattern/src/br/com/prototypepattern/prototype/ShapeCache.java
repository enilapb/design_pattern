package br.com.prototypepattern.prototype;

import java.util.Hashtable;

import br.com.prototypepattern.model.Circle;
import br.com.prototypepattern.model.Rectangle;
import br.com.prototypepattern.model.Shape;
import br.com.prototypepattern.model.Square;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeID) {
		Shape cachedShape = shapeMap.get(shapeID);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
	}

}
