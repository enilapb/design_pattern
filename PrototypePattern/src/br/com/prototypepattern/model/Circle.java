package br.com.prototypepattern.model;

public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

	
}
