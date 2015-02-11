/**
  * CurrencyConverter.java program
  * @author Matthew Soulanille
  * @version 2014-10-22
*/

import java.util.Scanner;

public class CurrencyConverter
{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter exchange rate: ");
	double rate = sc.nextDouble();
	while (true) {
	    System.out.print("Enter amount to exchange: ");
	    if (!sc.hasNextDouble()) {
		if (sc.next().equals("Q")) {
		    break;
		}
		else {
		    System.out.println("Invalid Input");
		}
	    }
	    else {
	    double convert = sc.nextDouble();
	    System.out.println("\n" + convert * rate);
	    }
	}
    }
}
