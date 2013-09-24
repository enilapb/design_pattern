package br.com.abstractfactory.model.color;

public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
