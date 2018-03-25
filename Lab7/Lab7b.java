// Lab 7b
// Brandon Shearrer
// 60968

import java.util.*;

public class Lab7b
{
	public static void main(String args[])
	{
		// Create a new HashMap called "songStars"
		HashMap<String, Integer> songStars = new HashMap<String, Integer>();
		
		// Yes, you can find all these on Youtube.
		songStars.put("The ballad of Bilbo Baggins", 5);
		songStars.put("A still more glorious dawn", 4);
		songStars.put("A finite simple group of order two", 4);
		songStars.put("Code monkey", 4);
		songStars.put("Fish heads", 2);
		songStars.put("I'll form the head", 3);
		songStars.put("Honeybee", 5);
		songStars.put("Revolution 9", 1);
		
		// Get the number of stars for "Code monkey", and print the # of stars
		double video = songStars.get("Code monkey");
		System.out.println(video);
		
		// Remove the song "Honeybee"
		songStars.remove("Honeybee 5");
		
		// Determine if "Honeybee 5" is still in the table.
		// If it is in the table, print "Honeybee still in table".
		// Otherwise print "Successfully removed Honeybee".

		if (songStars.containsValue("Honeybee 5"))
			{
				System.out.print("Honeybee still in table");
			}
		else
			{
				System.out.print("Successfully removed Honeybee");
			}
		
	}
}
