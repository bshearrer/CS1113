//Brandon Shearrer
//CS 1113 - 60968
//Program 6


import java.util.*;
import java.util.logging.Logger;

public class PostfixCalc
{
	public static HashMap<String, Double> memory = new HashMap<String, Double>();
	public static Stack<Double> info = new Stack<Double>();
	public static boolean ERROR = false;
	public static double ans = 0;
	public static Logger LOGGER = Logger.getLogger("InfoLogging");

	public static void solve(String[] tokens, int n)
	{
			try
			{
				for(int i = 0 + n; i < tokens.length; i++)
				{
					if(isNumber(tokens[i]))
					{
						double value = Double.parseDouble(tokens[i]);
						info.push(value);
						continue;
					}
					else if (memory.containsKey(tokens[i]))
					{
						if(memory.get(tokens[i]) != null)
						{	
							double value = memory.get(tokens[i]);
							info.push(value);
							continue;
						}
						else 
						{
							System.out.print("Variable does not equal anything");
							ERROR = true;
							break;
						}
					}

					else if(!(memory.containsKey(tokens[i])) && !(tokens[i].equals("+")) && !(tokens[i].equals("-")) &&
							!(tokens[i].equals("*")) && !(tokens[i].equals("/")) && !(tokens[i].equals("^")) && !(tokens[i].equals("sqrt")) && 
							!(tokens[i].equals("cos")) && !(tokens[i].equals("tan"))&& !(tokens[i].equals("sin")) &&
							!(tokens[i].equals("clear")) &&	!(tokens[i].equals("delete")) && !(tokens[i].equals("var")))
					{
						memory.put(tokens[i], 0.0);
						info.push(0.0);
					}

					//Add
					else if (tokens[i].equals("+"))
					{
							double x = info.pop();
							double y = info.pop();
							double z = x + y;
							info.push(z);
					}

					//Subtract
					else if(tokens[i].equals("-"))
					{
							double x = info.pop();
							double y = info.pop();
							double z = y - x;
							info.push(z);
					}

					//Multiply
					else if(tokens[i].equals("*"))
					{
							double x = info.pop();
							double y = info.pop();
							double z = y * x;
							info.push(z);
					}

					//Divide
					else if(tokens[i].equals("/"))
					{
							double x = info.pop();
							double y = info.pop();
							double z = y / x;
							info.push(z);
					}

					//Exponent
					else if(tokens[i].equals("^"))
					{
							double x = info.pop();
							double y = info.pop();
							double z = Math.pow(y, x);
							info.push(z);
					}

					//Trig Function: Cosine
					else if(tokens[i].equalsIgnoreCase("cos"))
					{
							double x = info.pop();
							info.push( Math.cos(x));
					}

					//Trig Function: Sine
					else if (tokens[i].equalsIgnoreCase("sin"))
					{
							double x = info.pop();
							info.push( Math.sin(x));
					}

					//Trig Function: Tangent
					else if(tokens[i].equalsIgnoreCase("tan"))
					{
							double x = info.pop();
							info.push( Math.tan(x));
					}

					//Square Root
					else if(tokens[i].equalsIgnoreCase("sqrt"))
					{
							double x = info.pop();
							info.push( Math.sqrt(x));
					}
					else
					{
						System.out.println("Unknown input");
						ERROR = true;
						break;
					}
				}
			}
			catch(EmptyStackException ex)
			{
				System.out.println("Error: Invalid Input");
			}
			//Print
			try
			{
				if (!ERROR && info.size() == 1)
				{
					ans = info.pop();
					System.out.println("> "+ ans);
					info.clear();
				}
				else
				{
						System.out.println("> Error! Not enough operators.");
						System.out.println("> Please type help for more info");
						info.clear();
				}
			}
			catch(EmptyStackException ex)
			{
				System.out.println("> Unsolvable");
			}	
		}

	
	public static boolean isNumber(String s)
	{
		try
		{
			Double.parseDouble(s);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}

	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Brandon Shearrer - Postfix Calculator");
		System.out.println("Type > Help < for more options");
		System.out.println(" * Please use lowercase for variables * ");
		System.out.println("---------------------------------------");
		System.out.println();
		while(true)
		{
			ERROR = false;
			System.out.print("> ");
			String thisLine = scan.nextLine();
			String[] t = thisLine.split(" ");
			// change to Arraylist, removing any "" to acount for any un nessesary " "s in actual imput
			ArrayList<String> imput = new ArrayList<>();
			for (int count = 0; count < t.length; count++)
			{
				if(t[count].equals("") || t[count].equals(" "))
				{
					continue;
				}
				else 
				{
					imput.add(t[count]);
				}
			}
			// change back
			String[] tokens = new String[imput.size()];
			for(int i = 0; i < tokens.length; i++)
			{
				tokens[i] = imput.get(i);
			}
		
			if(!(tokens.length >= 1))
			{
				continue;
			}
			
			if (tokens[0].equalsIgnoreCase("quit"))
			{
				break;
			}
			else if (tokens[0].equalsIgnoreCase("clear"))
			{
				memory.clear();
				System.out.println("> Variables removed successfuly! ");
			}
			else if (tokens[0].equalsIgnoreCase("help"))
			{
				System.out.print("Operands: +  -  *  /  ^ sin cos tan sqrt \n Commands: \n   var: displayes all defined variables \n   delete <variableName>: will delete spesifide variable \n   quit: will exit the calculator \n   clear: will delete all variables\n Usage: [number1] [number2] [operator]\n");
			}
			else if (tokens[0].equalsIgnoreCase("var"))
			{
				System.out.print("> | ");
				for(Map.Entry<String, Double> entry : memory.entrySet())
				{
					System.out.print(entry.getKey() + ": "+ entry.getValue() + " ");
				}
				System.out.print(" |\n");
			}
			else if(tokens[0].equalsIgnoreCase("delete"))
			{
				if(tokens.length == 2)
				{
					memory.remove(tokens[1]);
				}
				else
				{
					System.out.println("> User may delete one variable at a time");
				}
			}
			else if(tokens.length > 1 && tokens[1].equals("="))
			{
				if(isNumber(tokens[0]))
				{
					System.out.println("> Variables can only be numbers");
					continue;
				}
				else 
				{
					solve(tokens, 2);
					memory.put(tokens[0], ans);
				}
			}
			else
			{
				solve(tokens, 0);
			}
		}
	}
}