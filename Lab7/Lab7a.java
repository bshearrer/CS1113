// Lab 7a
// Brandon Shearrer
// CS 1113 - 60968
import java.util.*;
public class Lab7a
{
	public static void main(String args[])
	{
		ArrayList<Double> list = createSquaresList(10);
		printList(list);
		removeElement(list, 4);
		printList(list);
		swapElements(list, 2, 6);
		printList(list);

		double max = getMaxValue(list);
		double ave = getAverage(list);
		// Print the max and average
		System.out.println(max);
		System.out.println(ave);

		int idx1 = linearSearch(list, 4);
		int idx2 = linearSearch(list, 75);

		// Print the two indices
		System.out.println(idx1);
		System.out.println(idx2); 
	}
	public static ArrayList<Double> createSquaresList(int n)
	{
		// Create an ArrayList with the squares of n numbers, 0 to n-1
		// Return the ArrayList
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i<n; i++) 
		{
			list.add((double)(i*i));
		}
		return list;
	}

	public static double getMaxValue(ArrayList<Double> list)
	{
		double newMax = list.get(0);
		for (int d=0; d<list.size(); d++)
		{
			if (list.get(d) > newMax)
			{
				newMax = list.get(d);
			}
		}		
		return newMax;
	}
	
	public static double getAverage(ArrayList<Double> list)
	{
		double count = 1;
		double add = 0;
		double newAve = add/count;
		for (int s=0; s<list.size(); s++)
		{
			count++;
			add += list.get(s);
			newAve = add/count;
		}
		return 0.0;
	}
	public static void removeElement(ArrayList<Double> list, int index)
	{
		// Remove the specified element.
		//Double swap = list.get(index);
		//list.set(index, list.get(list.size()-1));
		//list.set(list.size()-1, swap);
		list.remove(index);
	}
	public static void swapElements(ArrayList<Double> list, int a, int b)
	{
		// Write code that swaps elements a and b of the ArrayList
		// Hint: you need a temporary variable.
		double swap = list.get(a);
		list.set(a, list.get(b));
		list.set(b, swap);
	}
	public static int linearSearch(ArrayList<Double> list, double val)
	{
		// Use a linear search to find the index of a particular value.
		// Return that index, or -1 if the value is not found.
		// Do not use list.indexOf(val)
		for (int a=0; a<list.size(); a++)
		{
			if (list.get(a) == val)
			{
				return a;
			}
		}		
		return -1;
	}
	public static void printList(ArrayList<Double> list)
	{
		// Print out the number of the list on one line, separated by
		// a comma and space, with a newline at the end.
		for (int i = 0; i<list.size(); i++)
		{
			System.out.printf("%1.0f, ", list.get(i));
			//System.out.println(list.get(i));
		}
		System.out.println();
	}
}
