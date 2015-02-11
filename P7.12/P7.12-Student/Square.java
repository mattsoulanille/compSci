
/**
 * Write a description of class Square here.
 * 
 * @author  
 * @version 2013-11-18
 */

import java.util.ArrayList;
import java.util.Math;
public class Square
{
    private int[][] square;  // will be used to store the Magic Square
    private ArrayList<Integer> valuesGiven;     // will collect values from user to 
                                                // place in Magic Square
    private int squareDimension;
    private int colRowDiagSum;      // reference for comparing sums of 
                                    // columns, rows, and diagonals
    

    /**
     * Constructor for objects of class Square
     * Takes an ArrayList of integers as a parameter and tries to
     * fill up a square grid of values with those number so that
     * we can check to see if it's magic
     * 
     * @param values an ArrayList of integers
     */
    public Square()
    {
        squareDimension = 0; 
        colRowDiagSum = 0;
        valuesGiven = new ArrayList<Integer>();
    }


    /**
     * add method adds an integer to the list of values that will form the magic square
     * @param i the number to add to the list
     */
    public void add (int i)
    {
	valuesGiven.add(i);
        
    }
    
    
    /**
     * isMagic method takes the values that have been added to the square and:
     * a) tries to make them into a square, and then 
     * b) uses a number of other methods to identify
     *    whether the grid of values satisfies the requirements for
     *    being a magic square:
     * 
     *    1. n^2 numbers must have been entered
     *    2. Each of numbers 1, 2, ..., n^2 must occur exactly once in the square
     *    3. When numbers are put in square form, do sums of row, columns, and diagonals
     *       all equal each other?
     * 
     * If all conditions are met, it's a magic square.
     * @return true if the square is magic
     */
    public boolean isMagic()
    {
        // Identify the squareDimension (size) of the square based on the number of
        // values given
        squareDimension = Math.ceil(Math.pow(valuesGiven.size(), 0.5));
        
        // Initialize the "square" 2-d array to the appropriate dimensions
	square = new int[squareDimension][squareDimension];
        
        // Go through the valuesGiven and assign them to the square 2-d array
	int count = 0;
	for (int i = 0; i < squareDimension; i++) {
	    for (int j = 0; j < squareDimension; j++) {
		square[i][j] = valuesGiven.get(count);
		count ++;
	    }
	}

        
        // Print out the array so we can see what it looks like 
        System.out.println(asString(square));
        
        
        // initialize this to initial value for future comparisons
        colRowDiagSum = colSum(0);
        
        
        
        if (!isASquare())
        {
            System.out.println("Sorry, you didn't enter the correct number of values to make a square.");
            return false;
        }
        else if (!allNumbersEntered())
        {
            System.out.println("Sorry, you didn't include all the numbers from 1 to " + valuesGiven.size());
            return false;
        }
        else if (!columnsHaveEqualValues())
        {
            System.out.println("Sorry, the columns don't all add up as they should.");
            return false;
        }
        else if (!rowsHaveEqualValues())
        {
            System.out.println("Sorry, the rows don't all add up as they should.");
            return false;
        }
        else if (!diagonalsHaveEqualValues())
        {
            System.out.println("Sorry, the diagonals don't all add up as they should.");
            return false;
        }
        else
            return true;
    }
    
    
    
    /**
     * isASquare method checks to see if the array list sent has values that form
     * a square
     * @return true if the values form a square
     */
    public boolean isASquare()
    {  
	if (Math.pow(valuesGiven.size(), 0.5) % 1 <0.0000001) {
	    return true;
        }
	return false;
        
    }
    
    /**
     * The allNumbersEntered checks the array to make sure that all of the values from 
     * 1 - n^2 have been entered.
     * @return true if the values have all been entered
     */
    public boolean allNumbersEntered()
    {   

        
        
        
        
    }
    
    /**
     * The rowSum calculates the sum of a specified row
     * @param the row to sum values in
     * @return the sum of the values in that row
     */
    public int rowSum(int row)
    {
	int sum = 0;
        for (int i; i < squareDimension; i ++) {
	    sum += square[row][i]
        }
	return sum;
    }
    
    /**
     * The colSum method calculates the sum of a specified column
     * @param the column to sum values in
     * @return the sum of the values in that column
     */
    public int colSum(int col)
    {
	int sum = 0;
        for (int i; i < squareDimension; i ++) {
	    sum += square[i][col]
        }
	return sum;
    }
    
    /**
     * The columnsHaveEqualValues returns true if the columns all have equal values
     * @return true if the column sums are all equal
     */
    public boolean columnsHaveEqualValues()
    {
	
        for (
        
        
        
    }
    
    /**
     * The rowsHaveEqualValues returns true if the rowsums all have equal values
     * @return true if the row sums are all equal
     */
    public boolean rowsHaveEqualValues()
    {
        
        
        
        
        
        
    }

    
    /**
     * The sumDiagonals method identifies the sums of the diagonals?
     * How will that be implemented? What kind of method should it be?
     * What parameters, if any, should it have?
     */
    public boolean diagonalsHaveEqualValues()
    {






    }
    
    /**
     * the asString method prints out the magic square, or at least as much of it
     * as we were able to read in
     */
    
    public String asString()
    {
        String display = "";
        // Showing square that we've entered
        for (int row = 0; row < squareDimension; row++)
        {
            for (int col = 0; col < squareDimension; col++)
            {
                display += square[row][col] + "\t";
            }
            display += "\n";
        }
        return display;
    }
}
