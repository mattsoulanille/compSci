/**
  * FibonacciRunner.java program
  * @author Matthew Soulanille
  * @version 2014-10-23
*/
import java.util.Scanner;

public class FibonacciRunner
{

    public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
	FibonacciGenerator fib = new FibonacciGenerator();
	System.out.print("Which Fibonacci term you want? : ");
	
	int last = s.nextInt();
	
	for (int i = 0; i < last - 1; i ++) {
	    fib.nextNumber();
	}
	long term = fib.nextNumber();
	System.out.println("\n" + term);
    }
}
