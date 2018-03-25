// SplitFile
// <Your name>
// <Your section>
import java.util.*;
import java.io.*;
public class SplitFile
{
	public static void main(String[] args)
	{
		// Usage statement (3 inputs needed)
		if (args.length == 0) 
		{
			System.out.println("usage: java SplitFile [file1] [file2] [file]");
		}
		else
		{
			PrintWriter file1 = null;
			PrintWriter file2 = null;
			try 
			{
				// Open Scanner for file named args[0]
				Scanner scan = new Scanner(new File(args[0]));

				// Open a PrintWriter for file named args[1]
				file1 = new PrintWriter(new File(args[1]));

				// Open a PrintWriter for file named args[2]
				file2 = new PrintWriter(new File(args[2]));

				while (scan.hasNextLine())
				{
					// Read a line from scan
					// Write that line to file1
					String line = scan.nextLine();
					file1.println(line);
					if (scan.hasNextLine())
					{
						// Read a line from scan
						// Write that line to file2
						String a = scan.nextLine();
						file2.println(a);
					}
				}
			}
				// Catch the IOException
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
				// Create a finally block that closes the two PrintWriters
				file1.close();
				file2.close();
		}
	}
} 