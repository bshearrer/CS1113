//==========================================
// CS 1113 Progam 1 : Mini Madlibs
// Semester : Fall 2017
// Author : Brandon Shearrer
// Class CRN : 60968
//==========================================
import java.util.Scanner;
public class Madlibs
{
    public static void main(String[] args)
    {	
		System.out.println("Created by > Brandon Shearrer <");
		System.out.println(" ");
		Scanner input = new Scanner(System.in);
		
		//This line prints a name
		System.out.println("Please type your name > ");
		String name = input.nextLine();
		
		//This line prints an adjective
		System.out.println("Please enter an adjective > ");
		String adjective = input.nextLine();
		
		//This line prints a city
		System.out.println("Please enter a city > ");
		String city = input.nextLine();
		
		//This line prints a sport
		System.out.println("Please enter a sport > ");
		String sport = input.nextLine();
		
		//This prints out the madlib story
		System.out.println("One day " + name + " was feeling super " + adjective + ". However,");
		System.out.println("there was a super important " + sport + " game that he/she had");
		System.out.println("to attend later that day in " + city + ".");
    }
}   

//----------------------------------------------------------
// One day (name) was feeling super (adjective). However,
// there was a super important (sport) game that he/she had
// to attend later that day in (city).
//-----------------------------------------------------------