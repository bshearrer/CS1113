//==========================================
// CS 1113 Progam 4 : Braille
// Semester : Fall 2017
// Author : Brandon Shearrer
// Class CRN : 60968
//==========================================
import java.util.*;

public class Program4
{
	public static String code1 = ". |";
	public static String code2 = " .|";
	public static String code3 = "..|";
	public static String code4 = "  |";
	public static String space = "   |";

	public static void main(String[] args)
	{
		//print out my name
		System.out.println("Created by Brandon Shearrer");
		System.out.println("");

		int i;
		//import scanner
		Scanner scan = new Scanner(System.in); 

		System.out.print("Please enter a phrase > ");
		String phrase = scan.nextLine();
		//prints the phrase above braille
		for (int j = 0; j<phrase.length(); j++) 
		{
			System.out.print(phrase.charAt(j) + "  ");	
		}
		System.out.println();
		//prints the first line of braille
		for (i = 0; i<phrase.length(); i++)
		{
		char s = phrase.charAt(i);
		String s1 = row1(s);
		System.out.print(s1);
		}
		System.out.println();
		//prints the second line of braille
		for (i = 0; i<phrase.length(); i++)
		{
		char b = phrase.charAt(i);
		String s2 = row2(b);
		System.out.print(s2);
		}
		System.out.println();
		//prints the third line of braille
		for (i = 0; i<phrase.length(); i++)
		{
		char c = phrase.charAt(i);
		String s3 = row3(c);
		System.out.print(s3);
		}


		
	// Prints the first row
	}
	public static String row1(char a)
	{
		String r;
		String one;

			// if char a equals one of these letters
			if (   a == 'a' || a == '1' || a == 'b' 
				|| a == '5' || a == 'e' || a == '5'
				|| a == 'h' || a == 'k' || a == 'l'
				|| a == 'o' || a == 'r' || a == 'u'
				|| a == 'v' || a == 'z' || a == '8') 
			{
				// Then, it will print |. |
				 r = code1;	
			}
			else if    (a == 'i' || a == 'j' || a == '9'
					 || a == '0' || a == 's' || a == 't')
			{
				// Then, it will print | .|
				 r = code2;
			}
			else if (  a == 'c' || a == '3' || a == '4'
					|| a == 'd' || a == '6' || a == 'f'
					|| a == '7' || a == 'g' || a == 'm'
					|| a == 'n' || a == 'p' || a == 'q'
					|| a == 'x' || a == 'y') 
			{
				// Then, it will print |..|
				 r = code3;
			}

			else
			{
				// Then, it will print a space
				 r = space;
			}
	return r;
	}

	//prints the second row
	public static String row2(char a)
	{
		String r;
		String one;

			// if char a equals one of these letters
			if (   a == 'b' || a == 'f' || a == 'i' 
				|| a == 'l' || a == 'p' || a == 's'
				|| a == 'v') 
			{
				// Then, it will print |. |
				 r = code1;	
			}
			else if    (a == 'd' || a == 'e' || a == 'n'
					 || a == 'o' || a == 'y' || a == 'z')
			{
				// Then, it will print | .|
				 r = code2;
			}
			else if (  a == 'g' || a == 'h' || a == 'j'
					|| a == 'q' || a == 'r' || a == 't') 
			{
				// Then, it will print |..|
				 r = code3;
			}
			else if ( a == 'a' || a == 'c' || a == 'k' || a == 'm' || a == 'u' || a == 'x')
			{
				// Then, it will print |  |
				 r = code4;
			}
			else
			{
				r = space;
			}
	return r;
	}
	//prints the thrid row
	public static String row3(char a)
	{
		String r;
		String one;

			// if char a equals one of these letters
			if (   a == 'k' || a == 'l' || a == 'm' 
				|| a == 'n' || a == 'o' || a == 'p'
				|| a == 'q' || a == 'r' || a == 's'
				|| a == 't') 
			{
				// Then, it will print |. |
				 r = code1;	
			}
			else if (  a == 'u' || a == 'v' || a == 'x'
					|| a == 'y' || a == 'z') 
			{
				// Then, it will print |..|
				 r = code3;
			}
			else if ( a == 'a' || a == 'b' || a == 'c' 
				   || a == 'd' || a == 'e' || a == 'f'
				   || a == 'g' || a == 'h' || a == 'i'
				   || a == 'j')
			{
				// Then, it will print |  |
				 r = code4;
			}
			else
			{
				r = space;
			}
	return r;
	}
}