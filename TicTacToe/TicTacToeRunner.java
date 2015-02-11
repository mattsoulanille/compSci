/**
  * TicTacToeRunner.java program
  * @author Matthew Soulanille
  * @version 2014-11-19
*/

import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	String player = "x";
	TicTacToe game = new TicTacToe();
	while (true) {
	    System.out.print(game.toString());
	    System.out.print("Row for " + player + "(ctrl-c to exit) : ");
	    int row = in.nextInt();

	    System.out.print("Column for " + player + ": ");
	    int column = in.nextInt();
	    game.set(row, column, player);
	    if (player.equals("x")) {
		player = "o";
	    }
	    else {
		player = "x";
	    }
	}
    }
}
