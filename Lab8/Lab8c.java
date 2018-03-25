
// Lab 8c
// Brandon Shearrer
// 60968
// Largest value = 601

public class Lab8c
{
	public static void main(String[] args)
	{
		int SIZE = Integer.parseInt(args[0]);

		// Create a 3-dimensional array of double where
		// the size of each dimension is SIZE:
		double table[][][] = new double [SIZE][SIZE][SIZE];

		// Fill in the table using a 3-deep nested loop so that
		// table[a][b][c] = 1.5 for all a,b,c.
		for (int a=0; a<table.length; a++)
		{
			for (int b=0; b<table[a].length; b++)
			{
				for (int c=0; c<table[a][b].length; c++)
				{
					table[a][b][c] = 1.5;
				}
			}
		}			
	}
}