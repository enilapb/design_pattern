package br.com.abstractfactory.factory;

import br.com.abstractfactory.model.color.Blue;
import br.com.abstractfactory.model.color.Color;
import br.com.abstractfactory.model.color.Green;
import br.com.abstractfactory.model.color.Red;
import br.com.abstractfactory.model.shape.Shape;
import br.com.abstractfactory.util.ColorType;
import br.com.abstractfactory.util.ShapeType;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(ShapeType shapeType) {
		return null;
	}

	@Override
	public Color getColor(ColorType colorType) {
		if(colorType == null){
			return null;
		}
		if(colorType.equals(ColorType.RED)){
			return new Red();
		} else if(colorType.equals(ColorType.GREEN)){
			return new Green();
		} else if(colorType.equals(ColorType.BLUE)){
			return new Blue();
		}
		
		return null;
	}
	
	
}
