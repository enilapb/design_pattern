package br.com.abstractfactory.main;

import br.com.abstractfactory.factory.AbstractFactory;
import br.com.abstractfactory.factory.FactoryProducer;
import br.com.abstractfactory.model.color.Color;
import br.com.abstractfactory.model.shape.Shape;
import br.com.abstractfactory.util.ColorType;
import br.com.abstractfactory.util.ShapeType;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args){
		//Get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();

		Shape rec = shapeFactory.getShape(ShapeType.RECTANGLE);
		rec.draw();
		
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
		
		//Get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color red = colorFactory.getColor(ColorType.RED);
		red.fill();
		
		Color green = colorFactory.getColor(ColorType.GREEN);
		green.fill();
		
		Color blue = colorFactory.getColor(ColorType.BLUE);
		blue.fill();
		
	}
}
