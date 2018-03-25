
//Program 5: Sorting
//Brandon Shearrer
//CS 1113, 60968

import java.util.*;
import java.io.*;

public class PatientList
{
	public static void main(String[] args)
	{
		//Print out name, and format table
		System.out.println("Program 5: Sorting");
		System.out.println("Created By Brandon Shearrer");
		System.out.println();

		if (args.length < 2) 
		{
			System.out.println("Error: no specified file");
		}
		
		
		else
		{
			System.out.println("  Last           First         Age       Room");
			System.out.println("---------------------------------------------");

			try
			{
				//Create an ArrayList and Scanner
				ArrayList<Patient> patientlist = new ArrayList<>();
				Scanner scan = new Scanner(new File(args[0]));

				//While loop to go through input file
				while (scan.hasNext())
				{
					String line = scan.nextLine();
					String[] tokens = line.split(",");

					if (tokens.length < 4) 
					{
						System.out.println("    Error, incorrect values in input file.");
						continue;
					}

					String last = tokens[0];
					String first = tokens[1];
					int age = Integer.parseInt(tokens[2]);
					int room = Integer.parseInt(tokens[3]);

					Patient c = new Patient(last, first, age, room);
					patientlist.add(c);
				}

				//If else chain to sort based on user input
				if (args[1].equals("last"))
				{
					Collections.sort(patientlist, new LastComparator());
				}
				
				else if (args[1].equals("first"))
				{
					Collections.sort(patientlist, new FirstComparator());
				}

				else if (args[1].equals("age"))
				{
					Collections.sort(patientlist, new AgeComparator());
				}

				else if (args[1].equals("room"))
				{
					Collections.sort(patientlist, new RoomComparator());
				}
				else
				{
					System.out.println("Invalid sorting type, try: first, last, age, or room");
				}

				//System.out.println(patientlist);
				for (int i=0; i<patientlist.size(); i++)
				{
					System.out.println(patientlist.get(i));
				}

			}
		

			catch (FileNotFoundException ex)
			{
				System.out.println("File not found");
			}
		}
	}	

}

