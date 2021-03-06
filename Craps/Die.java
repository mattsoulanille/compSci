/**
  * Die.java program rolls dice
  * @author Matthew Soulanille
  * @version 2014-11-21
*/
import java.util.Random;

//rolls and formats strings for dice
public class Die
{
    private Random rand = new Random();
    private int value;
    private String[] out = new String[5];

    /**
       Constructs die and string outputs
     */
    public Die()
    {
	out[0] = "|           |\n";
	out[1] = "|     *     |\n";
	out[2] = "|       *   |\n";
	out[3] = "|   *       |\n";
	out[4] = "|   *   *   |\n";
    }

    /**
      Rolls dice and sets the value.
      @return value of roll
     */
    public int roll()
    {
	value = rand.nextInt(6) + 1;
	return value;
    }
    /**
       Formats a string that represents the die
       @return string representation of die
     */
    public String toString()
    {
	String outstr = "";
	outstr += "____________\n|           |\n";

	//row 1
	if (value == 2 || value == 3) {
	    outstr += out[2];
	} else if (value == 1) {
	    outstr += out[0];
	} else {
	    outstr += out[4];
	}
	//row 2
	outstr += out[0];
	//row 3

	if (value % 2 == 1) { //I don't like typing
	    outstr += out[1];
	}
	else if (value == 6) {
	    outstr += out[4];
	}
	//row 4
	outstr += out[0];
	//row 5
	if (value == 1) {
	    outstr += out[0];
	}
	else if (value < 4) {
	    outstr += out[3];
	}
	else {
	    outstr += out[4];
	}

	outstr += out[0];
	outstr += "_____________";
	return outstr;
    }
	
}
