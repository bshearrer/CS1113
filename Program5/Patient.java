//Program 5: Sorting
//Brandon Shearrer
//CS 1113, 60968

import java.util.*;

class LastComparator implements Comparator<Patient>
{
	public int compare(Patient c1, Patient c2)
	{
		String last1 = c1.last;
		String last2 = c2.last;
		return last1.compareTo(last2);
	}
}

class FirstComparator implements Comparator<Patient>
{
	public int compare(Patient c1, Patient c2)
	{
		String first1 = c1.first;
		String first2 = c2.first;
		return first1.compareTo(first2);
	}
}

class AgeComparator implements Comparator<Patient>
{
	public int compare(Patient c1, Patient c2) 
    {
		if (c1.age<c2.age)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}

class RoomComparator implements Comparator<Patient>
{
	public int compare(Patient c1, Patient c2) 
    {
		if (c1.room<c2.room)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}

public class Patient
{
	public String last;
	public String first;
	public int age;
	public int room;

	public Patient(String n, String s, int p, int r)
	{
		last = n;
		first = s;
		age = p;
		room = r;
	}

	public String toString()
	{
		//return last + "," + state + "," + population;
		String s = String.format("%-15s%-10s%10d%10d", 
			last, first, age, room);
		return s;
	}
}

