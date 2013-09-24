package br.com.abstractfactory.model.shape;

public class Square implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
