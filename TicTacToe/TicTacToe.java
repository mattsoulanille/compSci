/**
  * TicTacToe.java program
  * @author Matthew Soulanille
  * @version 2014-11-19
*/

public class TicTacToe
{
    private String[][] board;
    private static final int r = 3;
    private static final int c = 3;

    public TicTacToe()
    {
	board = new String[r][c];
	fill(" ");
    }

    public void fill(String fill)
    {
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		board[i][j] = fill;
	    }
	}
    }

    public void set(int i, int j, String player)
    {
	if (board[i][j].equals(" ")) {
	    board[i][j] = player;
	}
    }

    public String toString()
    {
	String s = "";
	for (int i = 0; i < r; i++) {
	    s += "|";
	    for (int j = 0; j < c; j++) {
		s += board[i][j];
	    }
	    s += "|\n";
	}
	return s;
    }
}
