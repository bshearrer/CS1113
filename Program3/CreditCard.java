//==========================================
// CS 1113 Progam 3 : CreditCard
// Semester : Fall 2017
// Author : Brandon Shearrer
// Class CRN : 60968
//==========================================

import java.util.*;
public class CreditCard
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//Print out name
		//Gather customer name
		System.out.println("Created by > Brandon Shearrer < ");
		System.out.println();
		System.out.print("Enter your name > ");
		String name = scan.next();

		//Gather member level
		//and if input is wrong redirect user
		//to type in correct input
		System.out.print("Enter your member level > ");
		String level =scan.next();
		while (true) //Loop for Member level
		{
			if (level.equalsIgnoreCase("horrible") || level.equalsIgnoreCase("Despicable") || level.equalsIgnoreCase("Niceguy"))
			{
        //Beginning for Horrible Class Level
        if (level.equalsIgnoreCase("horrible"))
        {
				//User enter's balance
          System.out.print("Enter your current balance > ");
          double balance = scan.nextDouble();

          System.out.print("Was the payment made late? > ");
          String late = scan.next();
          //Loop for the late payment
          while (true)
          {
            if (late.equalsIgnoreCase("yes") || late.equalsIgnoreCase("no"))
            {
              if (late.equalsIgnoreCase("yes"))
              {
                //All information is collected and printed now!
								double paymentToPrinciple = 0.04 * balance;
								double interestPayment = 0.031 * balance;
								double minimumPayment = paymentToPrinciple + interestPayment;
								double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
								double percentToFees = 100 - percentToPrinciple;
								System.out.println();
                System.out.println("Bill for " + level + " customer ");
                System.out.printf("Card Balance: $%1.2f%n", balance);
								System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
								System.out.printf("Interest for on-time payment: (.031 of principle): $%1.2f%n", interestPayment);
								System.out.println("Late fee: $10");
								System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
								System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
								System.out.println("%");
								System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
								System.out.print("%");
              }
              else
              {

								double paymentToPrinciple = 0.04 * balance;
								double interestPayment = 0.02 * balance;
								double minimumPayment = paymentToPrinciple + interestPayment;
								double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
								double percentToFees = 100 - percentToPrinciple;
								System.out.println();
                System.out.println("Bill for " + level + " customer " + name);
                System.out.printf("Card Balance: $%1.2f%n", balance);
								System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
								System.out.printf("Interest for on-time payment: (.02 of principle): $%1.2f%n", interestPayment);
								System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
								System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
								System.out.println("%");
								System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
								System.out.print("%");
              }
              break;
            }
            else
            {
              System.out.println("Please enter Yes or No.");
              late = scan.next();
            }
          }
				}
				//End of HORRIBLE class information

        //Beginning for Despicable Level
        else if (level.equalsIgnoreCase("despicable"))
        {
          System.out.print("Enter your current balance > ");
          double balance = scan.nextDouble();

          System.out.print("Was the payment made late? > ");
          String late = scan.next();
          //Loop for late payment
          while (true)
          {
            if (late.equalsIgnoreCase("yes") || late.equalsIgnoreCase("no"))
            {
                if (late.equalsIgnoreCase("yes"))
                {
                  //All information is collected and printed now!
									double paymentToPrinciple = 0.04 * balance;
									double interestPayment = 0.018 * balance;
									double minimumPayment = paymentToPrinciple + interestPayment;
									double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
									double percentToFees = 100 - percentToPrinciple;
									System.out.println();
                	System.out.println("Bill for " + level + " customer " + name);
	                System.out.printf("Card Balance: $%1.2f%n", balance);
									System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
									System.out.printf("Interest for on-time payment: (.018 of principle): $%1.2f%n", interestPayment);
									System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
									System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
									System.out.println("%");
									System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
									System.out.print("%");
                }
                else
                {
									double paymentToPrinciple = 0.04 * balance;
									double interestPayment = 0.008 * balance;
									double minimumPayment = paymentToPrinciple + interestPayment;
									double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
									double percentToFees = 100 - percentToPrinciple;
									System.out.println();
                	System.out.println("Bill for " + level + " customer " + name);
	                System.out.printf("Card Balance: $%1.2f%n", balance);
									System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
									System.out.printf("Interest for on-time payment: (.008 of principle): $%1.2f%n", interestPayment);
									System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
									System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
									System.out.println("%");
									System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
									System.out.print("%");
                }
              break;
            }
            else
            {
              System.out.println("Please enter Yes or No.");
              late = scan.next();
            }
          }
        }
				//End for DESPICABLE class

        //Beginning for Niceguy class
        else
        {
          System.out.print("Enter your current balance > ");
          double balance = scan.nextDouble();

          System.out.print("Was the payment made late? > ");
          String late = scan.next();
          //Loop for late payment
          while (true)
          {
            if (late.equalsIgnoreCase("yes") || late.equalsIgnoreCase("no"))
            {
              if (late.equalsIgnoreCase("yes"))
              {
                //All information is collected and printed now!
								double paymentToPrinciple = 0.04 * balance;
								double interestPayment = 0.043 * balance;
								double minimumPayment = paymentToPrinciple + interestPayment + 20;
								double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
								double percentToFees = 100 - percentToPrinciple;
								System.out.println();
                System.out.println("Bill for " + level + " customer " + name);
                System.out.printf("Card Balance: $%1.2f%n", balance);
								System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
								System.out.printf("Interest for on-time payment: (.043 of principle): $%1.2f%n", interestPayment);
								System.out.println("Late fee: $20.00");
								System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
								System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
								System.out.println("%");
								System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
								System.out.print("%");
              }
              else
              {
								double paymentToPrinciple = 0.04 * balance;
								double interestPayment = 0.031 * balance;
								double minimumPayment = paymentToPrinciple + interestPayment;
								double percentToPrinciple = 100 * (paymentToPrinciple / minimumPayment);
								double percentToFees = 100 - percentToPrinciple;
								System.out.println();
                System.out.println("Bill for " + level + " customer " + name);
                System.out.printf("Card Balance: $%1.2f%n", balance);
								System.out.printf("Minimum payment to principle (.04 of principle): $%1.2f%n", paymentToPrinciple);
								System.out.printf("Interest for on-time payment: (.031 of principle): $%1.2f%n", interestPayment);
								System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", minimumPayment);
								System.out.printf("Percent to principle: %1.1f", percentToPrinciple);
								System.out.println("%");
								System.out.printf("Percent to interest and fees: %1.1f", percentToFees);
								System.out.print("%");
              }

              break;
            }
            else
            {
              System.out.println("Please enter Yes or No.");
              late = scan.next();
            }
          }
        }
        break;
				//End of NICEGUY class
			}
			else
			{
				System.out.println("Please enter a valid level. (Despicable, Horrible, or Niceguy)");
				level = scan.next();
			}
		}
	}
} //End of Class
