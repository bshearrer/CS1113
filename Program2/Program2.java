//==========================================
// CS 1113 Progam 2 : The Drake Equation
// Semester : Fall 2017
// Author : Brandon Shearrer
// Class CRN : 60968
//==========================================
import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {	
		//This is the beginning of the program
		//and it prints out my name.
		System.out.println("Created by > Brandon Shearrer <");
		System.out.println(" ");
		Scanner input = new Scanner(System.in); 
		
		//This prints teh average rate question w/ input
		System.out.println("R = Average Rate of Milky Way star Formation in stars/year > ");
		double R = input.nextDouble();
		
		//This prints teh planets per star question w/ input
		System.out.println("E = Average number of planets per star > ");
		double E = input.nextDouble();
		
		//This prints the planets that have developed life question w/ input
		System.out.println("L = Fraction of planets that devlop life > ");
		double L = input.nextDouble();
		
		//This prints teh civilizations development question w/ input 
		System.out.println("I = Fraction of life bearing planets where civilizations develop > ");
		double I = input.nextDouble();
		
		//This prints the detectable communications question w/ input
		System.out.println("C = Fraction of civilizations that have detectable communications > ");
		double C = input.nextDouble();
		
		//This prints teh release signals question w/ input
		System.out.println("S = Length of time (in years) over which civilizations release signals > ");
		double S = input.nextDouble();
		
		//This line prints out the equation, and what numbers the user input
		System.out.println("N = R * E * L * I * C * S > " + R +" * "+ E + " * "+ L + " * "+ I + " * "+ C + " * "+ S + "");
		double myAnswer = R*E*L*I*C*S;
		
		//Final Answer
		System.out.printf("N = " + "%.2f" + " detectable civilizations in the Milky Way galaxy", myAnswer);
    }
}   
