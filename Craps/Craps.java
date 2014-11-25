/**
  * Craps.java program
  * @author Matthew Soulanille
  * @version 2014-11-21
*/

import java.util.Scanner;
public class Craps
{
    private static Scanner sc;
    private static Die d1 = new Die();
    private static Die d2 = new Die();
    private static int sum;
    
    //Checks if a string means yes or no. def means default return value
    public static boolean check(String in, boolean def) {
	if (in.equals("")) {
	    return def;
	}
	return in.substring(0,1).equalsIgnoreCase("y");
    }
    //Checks the first roll of dice
    public static int check1(int roll)
    {
	if (roll == 11 || roll == 7) {
	    return 2;
	}
	else if (roll == 2 || roll == 3 || roll == 12) {
	    return 0;
	}
	return 1;

    }
    //rolls dice, sets values, and prints dice. Returns the sum of dice.
    public static int roll() {
	
	System.out.println("Press return to roll dice");
	int rolls[] = new int[] {d1.roll(), d2.roll()};
	int sum = rolls[0] + rolls[1];
	
	sc.nextLine();
	System.out.println(d1);
	sc.nextLine();
	System.out.println(d2);

	System.out.println(rolls[0] + " + " + rolls[1] + " = " + sum);
	return sum;

    }
    private static boolean cont = true;

    //Runs play until the user wants to quit
    public static void main(String[] args)
    {
	sc = new Scanner(System.in);
	while (play()) {
	    continue;
	}

    }
    //play craps function. Essentially the main loop.
    public static boolean play()
    {

	System.out.println("Would you like to play Craps? (Y/n)");

	if (!check(sc.nextLine(), true)) {
	    return false;
	}
	System.out.println("Would you like instructions? (y/N)");

	if (check(sc.nextLine(), false)) {
	    System.out.println("Rules: \nTwo dice are rolled. If they sum 7 or 11, you win. If they are 2, 3, or 12, you lose. \n\nIf another number is rolled, this number becomes your point. Subsequent rolls are done until the sum equals your point, in which case you win, or the sum is 7, in which case you lose.");
	}

	System.out.println("Playing Craps: ");
	sum = roll();
	    
	if (check1(sum) == 2) {
	    System.out.println("You win!");
	    return true;
	}
	else if (check1(sum) == 0) {
	    System.out.println("You lose!");
	    return true;
	}

	int point = sum;
	System.out.println("Your point is " + point);
	while (true) {
	    sum = roll();
	    if (point == sum) {
		System.out.println("You win!");
		return true;
	    }
	    if (sum == 7) {
		System.out.println("You lose!");
		return true;
	    }
	    
	}
    }
}
