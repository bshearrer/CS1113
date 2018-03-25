// ReverseCL
// Brandon Shearrer
// 60968
public class AddNumbers
{
	public static void main(String[] args)
	{
		
		if (args.length == 0)
		{
			System.out.println("usage: java AddNumbers [int][int]");
		}
		else	
		{
			String s = args[0];
			String t = args[1];
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(t);
			int c = a+b;
			System.out.println(c);
		}	
	} 
} 