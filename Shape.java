//Author: Arshdeep Benipal
//Student ID: 100591622
//Date: October 3 2016
//Purpose: Lab 3  
import java.util.*;
import java.lang.Math.*;


public abstract class Shape{
	protected String colour;
	
	public static void main(String[]args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("Red", 2.0f));
		shapes.add(new Rectangle("Blue",1.5f,3.0f));
		for (Shape shape: shapes){
			System.out.println("");
			System.out.println(shape.toString());
			System.out.printf("Area: %.2f\n", shape.getArea());
			System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
		}
	}

	public Shape(String userColour)
	{
		this.colour = userColour;
	}
	abstract public double getPerimeter();
	abstract public double getArea();
	abstract public String toString();

}
