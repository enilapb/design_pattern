package br.com.abstractfactory.model.color;

public class Blue implements Color{
	
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
