// Lab 10
// Brandon Shearrer
// 60968
public class Rectangle extends GeometricObject
{
	public double height = 0.0;
	public double width = 0.0;
	public double area;
	public double perimeter;
	
	public Rectangle(double h, double w)
	{
		height = h;
		width = w;
	}
	public double getArea()
	{
		area = width * height;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = 2*(height+width);
		return perimeter;
	}
	public String toString()
	{
		return String.format("Cirlce: height =%1.3f width =%1.3f area = %1.3f perimeter = %1.3f", height, width, area, perimeter);		
	}
}

/*// Lab 10
// Brandon Shearrer
// 60968
public class Circle extends GeometricObject
{
	public static double radius;
	public static double area;
	public static double perimeter;

	public Circle (double r)
	{
		radius = r;
	}
	public double getArea()
	{
		area = Math.PI * radius * radius;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = Math.PI * 2.0 * radius;
		return perimeter;
	}
	public String toString()
	{
		return String.format("Cirlce: radius =%1.3f area = %1.3f perimeter = %1.3f", radius, area, perimeter);
	}
}
	*/