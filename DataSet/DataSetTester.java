
/**
 * DataSetTester tests the DataSet and the Measurable interface
 */
public class DataSetTester
{
    public static void main(String[] args)
    {
        // Set up a DataSet of "dice"
	DataSet dice = new DataSet();
        // Loop ten times, and each time...
        
        for (int i = 0; i < 10; i++)
        {
            // Create a new die
	    Die d = new Die();
            // Roll it and save the result here
	    d.cast();
	    dice.add(d);
            // Add the die with its roll to the DataSet
            // Print out the number of the dice and it's roll result
	    System.out.println("Die # " + i + ": " + d.getMeasure());
        }

	System.out.println("average roll was " + dice.getAverage());
        // Print out the average of all the rolls
	System.out.println("Highest roll was " + dice.getMaximum());
        // Get the die that had the highest roll and save it here
        // Print out the result of that roll     
        
    }
}
