//Author: Arshdeep Benipal
//Student ID: 100591622
//Date: October 3 2016
//Purpose: Lab 3  
import java.util.*;
import java.lang.Math.*;


public abstract class Shape
{
	//create a colour variable
	protected String colour;
	
	//initialize colour variable
	public Shape(String userColour)
	{
		this.colour = userColour;
	}
	//initialize all methods that subclasses will use
	abstract public double getPerimeter();
	abstract public double getArea();
	abstract public String toString();

}
