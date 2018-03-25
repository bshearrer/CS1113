// Lab 10
// Brandon Shearrer
// 60968
import java.util.ArrayList;
import java.util.*;

public class ObjectCalculator
{
	public static void main(String args[])
	{
		ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();

		// Create a Scanner to read input from the keyboard
		Scanner scan = new Scanner(System.in);

		// Prompt the user for a radius, get the radius from
		// the keyboard, and add the circle to the list of objects.
		System.out.print("Please enter a radius > ");
		double radius = scan.nextDouble();
		Circle circle = new Circle(radius);
		circle.getArea();
		circle.getPerimeter();
		objects.add(circle);

		// Prompt the user for a side length for an equilateral triangle.
		// Create an equilateral triangle with that side length and
		// add it to the list of objects.
		System.out.print("Please enter the side length > ");
		double side = scan.nextDouble();
		EquilateralTriangle triangle = new EquilateralTriangle(side);
		triangle.getArea();
		triangle.getPerimeter();
		objects.add(triangle);

		// Prompt the user for the width and height of a rectangle.
		// Create a rectangle with that width and height and add it
		// to the list of objects.
		System.out.print("Please provide a width and height > ");
		double h = Double.parseDouble(scan.next());
		double w = Double.parseDouble(scan.next());
		Rectangle rectangle = new Rectangle(h, w);
		rectangle.getArea();
		rectangle.getPerimeter();
		objects.add(rectangle);

		// Write a for loop that will print out all of the objects
		// in the list, along with their attributes (radius for circle,
		// width and height for rectangle, and side length for
		// equilateral triangle).
		for (int i = 0; i<objects.size(); i++)
		{
			System.out.println(objects.get(i));
		}

		// Write code that will calculate and print the total perimeter
		// and total area of all the objects in the list.
		double totalPerimeter = circle.getPerimeter() + rectangle.getPerimeter()
		+ triangle.getPerimeter();
		System.out.printf("Total Perimieter = %1.3f \n", totalPerimeter);
		double totalArea = circle.getArea() + rectangle.getArea() + triangle.getArea();
		System.out.printf("Total Area = %1.3f", totalArea);

	}
}
