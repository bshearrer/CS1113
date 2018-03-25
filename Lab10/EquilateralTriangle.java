// Lab 10
// Brandon Shearrer
// 60968
import java.util.*;

public class EquilateralTriangle extends GeometricObject
{
	public double sideLength;
	public double area;
	public double perimeter;

	public EquilateralTriangle(double s)
	{
		sideLength = s;
	}
	public double getArea()
	{
		area = ((Math.sqrt(3))/4)*sideLength*sideLength;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = 3 * sideLength;
		return perimeter;
	}
	public String toString()
	{
		return String.format("Cirlce: sideLength =%1.3f area = %1.3f perimeter = %1.3f", sideLength, area, perimeter);
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