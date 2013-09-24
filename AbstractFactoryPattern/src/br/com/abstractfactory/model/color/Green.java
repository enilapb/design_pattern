package br.com.abstractfactory.model.color;

public class Green implements Color{
	
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
