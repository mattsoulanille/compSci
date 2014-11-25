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
    

    public static boolean check(String in, boolean yes) {
	if (in.equals("")) {
	    return yes;
	}
	return in.substring(0,1).equalsIgnoreCase("y");
    }

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
    
    public static void roll() {
	
	System.out.println("Press return to roll dice");
	int rolls[] = new int[] {d1.roll(), d2.roll()};
	sum = rolls[0] + rolls[1];
	
	sc.nextLine();
	System.out.println(d1);
	sc.nextLine();
	System.out.println(d2);

	System.out.println(rolls[0] + " + " + rolls[1] + " = " + sum);

    }
    private static boolean cont = true;
    public static void main(String[] args)
    {
	sc = new Scanner(System.in);
	while (cont) {
	    play();
	}

    }

    public static void play()
    {

	System.out.println("Would you like to play Craps? (Y/n)");

	if (!check(sc.nextLine(), true)) {
	    cont = false;
	    return;
	}
	System.out.println("Would you like instructions? (y/N)");

	if (check(sc.nextLine(), false)) {
	    System.out.println("Rules: \nTwo dice are rolled. If they sum 7 or 11, you win. If they are 2, 3, or 12, you lose. \n\nIf another number is rolled, this number becomes your point. Subsequent rolls are done until the sum equals your point, in which case you win, or the sum is 7, in which case you lose.");
	}

	System.out.println("Playing Craps: ");
	roll();
	    
	if (check1(sum) == 2) {
	    System.out.println("You win!");
	    return;
	}
	else if (check1(sum) == 0) {
	    System.out.println("You lose!");
	    return;
	}

	int point = sum;
	System.out.println("Your point is " + point);
	while (true) {
	    roll();
	    if (point == sum) {
		System.out.println("You win!");
		return;
	    }
	    if (sum == 7) {
		System.out.println("You lose!");
		return;
	    }
	    
	}
    }
}
