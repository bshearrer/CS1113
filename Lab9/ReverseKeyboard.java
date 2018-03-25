// ReverseCL
// Brandon Shearrer
// 60968
import java.util.*;

public class ReverseKeyboard
{
	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter string input > ");
		String s = scan.nextLine();

		String rev = "";
		for (int i=0; i<s.length(); i++) 
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println(rev); 	
	} 
} 