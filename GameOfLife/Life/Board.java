/**
  * Board.java program
  * Keeps track of positions for Conway's game of life
  * @author Matthew Soulanille
  * @version 2014-12-01
*/

public class Board
{
    public boolean[][] cBoard;
    private boolean[][] nextBoard;
    private int[] dimensions;
    public Board(int xDimension, int yDimension) {
	cBoard = new boolean[yDimension][xDimension];
	nextBoard = new boolean[yDimension][xDimension];
	dimensions = new int[] {xDimension, yDimension};
    }

    public boolean[] getSurrounding(int x, int y) {
	boolean[] surround = new boolean[8];
	int loopCount = 0;
	for (int i = -1; i <= 1; i++) {
	    for (int j = -1; j <= 1; j++) {
		if (i != 0 || j != 0) {
		    try {
			surround[loopCount] = cBoard[y+j][x+i];
		    }
		    catch(Exception ArrayIndexOutOfBoundsException) {
			surround[loopCount] = false;
		    }
		    loopCount ++;
		}
	    }
	}
	return surround;
    }
    public int sCount(int x, int y) {
	boolean[] surround = getSurrounding(x,y);
	int sum = 0;
	for (boolean t : surround) {
	    if (t) {
		sum += 1;
	    }
	}
	return sum;
    }

    
    public void step() {
	for (int y = 0; y < dimensions[1]; y++) {
	    for (int x = 0; x < dimensions[0]; x++) {
		int friends = sCount(x,y);
		if (cBoard[y][x]) {
		    if (friends < 2 || friends > 3) {
			nextBoard[y][x] = false;
		    }
		    else {
			nextBoard[y][x] = true;
		    }
		}
		else {
		    if (friends == 3) {
			nextBoard[y][x] = true;
		    }
		}
	    }
	}
	boardDeepCopy(nextBoard, cBoard);
	
    }
    public void boardDeepCopy(boolean[][] a1, boolean[][] a2)
    {
	for (int y = 0; y < dimensions[1]; y++) {
	    for (int x = 0; x < dimensions[0]; x++) {
		a2[y][x] = a1[y][x];
	    }
	}
    }
    
    public void set(int x, int y, boolean value) {
	cBoard[y][x] = value;
    }

    public boolean get(int x, int y) {
	return cBoard[y][x];
    }

    public boolean[][] getBoard() {
	return cBoard;
    }

    public String toString() {
	String ret = new String();

	for (int y = 0; y < dimensions[1]; y++) {
	    for (int x = 0; x < dimensions[0]; x++) {
		if (cBoard[y][x]) {
		    ret += "0 ";
		}
		else {
		    ret += ". ";
		}
	    }
	    ret += "\n";
	}
	return ret;
    }
}
		    
	    
