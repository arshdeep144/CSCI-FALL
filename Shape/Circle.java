class Circle extends Shape
{
    //create a radius variable
    protected float radius;

    //initialize all variables
    public Circle (String userColour, float userRadius)
    {
	super (userColour);
	this.radius = userRadius;
    }

    // get the perimeter of the circle
    public double getPerimeter()
    {
	double perimeter;
	perimeter = 2 * Math.PI * this.radius;
	return perimeter;
    }

    //get the area of the circle
    public double getArea()
    {
	double area;
	area = Math.PI * Math.pow (this.radius, 2);
	return area;
    }
    
    //print out the description of the circle
    public String toString()
    {
    	return (this.colour + " Circle with radius " + this.radius);
    }
}
