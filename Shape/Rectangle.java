class Rectangle extends Shape
{
    protected float length;
    protected float width;

    public Rectangle (String userColour, float userLength, float userWidth)
    {
	super (userColour);
	this.length = userLength;
	this.width = userWidth;
    }

    public double getPerimeter()
    {
	double perimeter;
	perimeter = 2 * (this.length + this.width);
	return perimeter;
    }


    public double getArea()
    {
	double area;
	area = this.length * this.width;
	return area;
    }
    public String toString()
    {
    	return (this.colour + " Rectangle with length " + this.length + 
    		    " and width " + this.width);
    }
}