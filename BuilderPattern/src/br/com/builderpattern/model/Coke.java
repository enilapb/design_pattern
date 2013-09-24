package br.com.builderpattern.model;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

	
}
