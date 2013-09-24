package br.com.abstractfactory.factory;

import br.com.abstractfactory.model.color.Color;
import br.com.abstractfactory.model.shape.Shape;
import br.com.abstractfactory.util.ColorType;
import br.com.abstractfactory.util.ShapeType;

public abstract class AbstractFactory {

	public abstract Shape getShape(ShapeType shapeType);
	public abstract Color getColor(ColorType colorType);

}
