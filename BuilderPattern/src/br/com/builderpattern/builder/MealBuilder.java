package br.com.builderpattern.builder;

import br.com.builderpattern.model.ChickenBurger;
import br.com.builderpattern.model.Coke;
import br.com.builderpattern.model.Meal;
import br.com.builderpattern.model.Pepsi;
import br.com.builderpattern.model.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
