/**
  * NumberGuessingGame.java program
  * @author Matthew Soulanille
  * @version 2014-11-03
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class NumberGuessingGame
{
    
    private static Integer foo = 42;
    private static Random randGen = new Random();
    private static ArrayList<String> yes;
    public static boolean YesNoChecker(String in)
    {

	yes = new ArrayList<String>(5);
	yes.add("y");
	yes.add("yes");
	yes.add("ok");
	yes.add("sure");
	yes.add("why not?");
	if (yes.contains(in)) {
	    return true;
	}
	else {
	    return false;
	}

    }


    public static void main(String[] args)
    {
	int rand;
	Scanner sc = new Scanner(System.in);
	int guess;
	boolean resume = true;
	int bar = foo;
	while (resume) {
	    boolean win = false;
	    rand = randGen.nextInt(9) + 1;
	    System.out.println("Guess a number between 1 and 10 inclusive: ");
	    for (int i = 0; i < 3; i++) {
		guess = sc.nextInt();
		if (guess <  rand) {
		    System.out.println("Too low");
		}
		else if (guess > rand) {
		    System.out.println("Too high");
		}
		else {
		    win = true;
		    break;
		}
	    }
	    if (!win) {
		System.out.println("Try again? ");
	    }
	    else {
		System.out.println("Nice job, you win. Play again? ");
	    }
	    String resumeStr = sc.next().toLowerCase();
	    resume = YesNoChecker(resumeStr);
	
	}
    }
}
		    
	    
	
	
	
