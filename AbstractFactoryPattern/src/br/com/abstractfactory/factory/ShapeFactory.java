package br.com.abstractfactory.factory;

import br.com.abstractfactory.model.color.Color;
import br.com.abstractfactory.model.shape.*;
import br.com.abstractfactory.util.ColorType;
import br.com.abstractfactory.util.ShapeType;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(ShapeType shapeType) {
		if(shapeType == null){
			return null;
		}
		if(shapeType.equals(ShapeType.CIRCLE)){
			return new Circle();
		} else if(shapeType.equals(ShapeType.RECTANGLE)){
			return new Rectangle();
		} else if(shapeType.equals(ShapeType.SQUARE)){
			return new Square();
		}
		
		return null;
	}

	@Override
	public Color getColor(ColorType colorType) {
		return null;
	}
}
