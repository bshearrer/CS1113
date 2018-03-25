o// ReverseCL
// Brandon Shearrer
// 60968
public class ReverseCL2
{
	public static void main(String[] args)
	{
		
		if (args.length == 0)
		{
			System.out.println("usage: java ReverseCL2 [argument]");
		}
		else	
		{
			String s = args[0];
			String rev = "";

			for (int i=0; i<s.length(); i++) 
			{
				rev = s.charAt(i) + rev;
			}
			System.out.println(rev); 
		}	
	} 
} 