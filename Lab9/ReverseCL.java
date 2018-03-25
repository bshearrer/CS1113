// ReverseCL
// Brandon Shearrer
// 60968
public class ReverseCL
{
	public static void main(String[] args)
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