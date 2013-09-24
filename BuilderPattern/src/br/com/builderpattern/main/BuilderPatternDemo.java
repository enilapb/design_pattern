package br.com.builderpattern.main;

import br.com.builderpattern.builder.MealBuilder;
import br.com.builderpattern.model.Meal;

public class BuilderPatternDemo {

	public static void main(String[] args){
		MealBuilder builder = new MealBuilder();
		
		//VegMeal
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost : " + vegMeal.getCost());
		
		//Non VegMeal
		Meal nonVegMeal = builder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal ");
		nonVegMeal.showItems();
		System.out.println("Total Cost : " + nonVegMeal.getCost());
	}
}
