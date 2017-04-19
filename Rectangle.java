class Rectangle extends Shape
{
    //create a length and widthvariable
    protected float length;
    protected float width;

    //initialize all variables
    public Rectangle (String userColour, float userLength, float userWidth)
    {
	super (userColour);
	this.length = userLength;
	this.width = userWidth;
    }

    // get the perimeter of the rectangle
    public double getPerimeter()
    {
	double perimeter;
	perimeter = 2 * (this.length + this.width);
	return perimeter;
    }

    //get the area of the rectangle
    public double getArea()
    {
	double area;
	area = this.length * this.width;
	return area;
    }

    //print out the description of the rectangle
    public String toString()
    {
    	return (this.colour + " Rectangle with length " + this.length + 
    		    " and width " + this.width);
    }
}