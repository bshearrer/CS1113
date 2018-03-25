// Interleave
// <Your name>
// <Your section>
import java.util.*;
import java.io.*;
public class Interleave
{
	public static void main(String[] args)
	{
		// Usage statement (2 inputs needed)
		if (args.length == 0) 
		{
			System.out.println("usage: java Interleave [file][file]");	
		}
		else
		{
			try 
			{
				// Open scanner for file named args[0]
				Scanner scan1 = new Scanner(new File(args[0]));
				// Open scanner for file named args[1]
				Scanner scan2 = new Scanner(new File(args[1]));

				boolean moreLines = true;
				while (moreLines)
				{
					moreLines = false;
					// If scan1 has another line then read that line, copy it
					// to the console, and set moreLines to true
					if (scan1.hasNext())
					{
						String line = scan1.nextLine();
						System.out.println(line);
						moreLines = true;
					}
					// If the second scanner, scan2, has another line,
					// then get that line, copy it to the console, and set
					// moreLines to true.
					if (scan2.hasNext())
					{
						String line2 = scan2.nextLine();
						System.out.println(line2);
						moreLines = true;
					}
				}
			}

			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
} 