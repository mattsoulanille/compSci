/**
  * Life.java program
  * @author Matthew Soulanille
  * @version 2014-12-01
*/

import java.lang.Math;
import java.util.Scanner;
public class Life
{
    private static Board gameBoard;
    private static int[] dimensions;
    private static Scanner in;
    
    public static void main(String[] args)
    {
	in = new Scanner(System.in);
	dimensions = new int[] {100, 50};
	gameBoard = new Board(dimensions[0],dimensions[1]);
	
	System.out.println("What would you like?\n(1) Random board\n(2) Gospher glider gun");
	int choice = in.nextInt();
	if (choice == 1) {
	    System.out.print("Enter percentage of board to fill: ");
	    double percent = (double) in.nextInt();
	    if (percent > 100 || percent < 0) {
		System.out.println("Not okay input");
	    }
	    
	    for (int y = 0; y < dimensions[1]; y++) {
		for (int x = 0; x < dimensions[0]; x++) {
		    gameBoard.set(x,y,Math.random() < percent / 100);
		}
	    }
	}
	else if (choice == 2) {
	    gliderGun(dimensions[0] / 8, dimensions[1] / 4);
	}
	else {
	    return;
	}
	int generation = 0;
	while (true) {
	    System.out.println(gameBoard.toString());
	    System.out.println("Generation: " + generation);
	    
	    gameBoard.step();
	    generation ++;
	    
	    try {
		Thread.sleep(100);                 //1000 milliseconds is one second.
	    }
	    catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }

	}
    }



    public static void gliderGun(int p1, int p2)
    {
	gameBoard.set(p1,p2,true);
	gameBoard.set(p1 + 1, p2,true);
	gameBoard.set(p1, p2 + 1,true);
	gameBoard.set(p1 + 1, p2 + 1,true);

	gameBoard.set(p1 + 34,p2 - 2,true);
	gameBoard.set(p1 + 34, p2 - 1, true);
	gameBoard.set(p1 + 35, p2 - 2, true);
	gameBoard.set(p1 + 35, p2 - 1, true);

	gameBoard.set(p1 + 10, p2, true);
	gameBoard.set(p1 + 10, p2 + 1, true);
	gameBoard.set(p1 + 10, p2 + 2, true);

	gameBoard.set(p1 + 11, p2 - 1, true);
	gameBoard.set(p1 + 11, p2 + 3, true);

	gameBoard.set(p1 + 12, p2 - 2, true);
	gameBoard.set(p1 + 12, p2 + 4, true);

	gameBoard.set(p1 + 13, p2 - 2, true);
	gameBoard.set(p1 + 13, p2 + 4, true);

	gameBoard.set(p1 + 14, p2 + 1, true);

	gameBoard.set(p1 + 15, p2 + 3, true);
	gameBoard.set(p1 + 15, p2 - 1, true);

	gameBoard.set(p1 + 16, p2, true);
	gameBoard.set(p1 + 16, p2 + 1, true);
	gameBoard.set(p1 + 16, p2 + 2, true);

	gameBoard.set(p1 + 17, p2 + 1, true);

	gameBoard.set(p1 + 20, p2 - 2, true);
	gameBoard.set(p1 + 20, p2 - 1, true);
	gameBoard.set(p1 + 20, p2, true);

	gameBoard.set(p1 + 21, p2 - 2, true);
	gameBoard.set(p1 + 21, p2 - 1, true);
	gameBoard.set(p1 + 21, p2, true);

	gameBoard.set(p1 + 22, p2 - 3, true);
	gameBoard.set(p1 + 22, p2 + 1, true);

	gameBoard.set(p1 + 24, p2 - 4, true);
	gameBoard.set(p1 + 24, p2 - 3, true);
	gameBoard.set(p1 + 24, p2 + 1, true);
	gameBoard.set(p1 + 24, p2 + 2, true);


	
	
    }
    
}
