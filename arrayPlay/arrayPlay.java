/**
  * arrayPlay.java program
  * @author Matthew Soulanille
  * @version 2014-11-12
*/
import java.util.Random;
import java.lang.Integer;
public class arrayPlay
{

    public static void main(String[] args)
    {
	int[] rData = new int[100];
	Random rand = new Random();
	int randInt;
	
	for (int i=0;i<rData.length;i++) {

	    randInt = rand.nextInt(2001) - 1000;
	    rData[i] = randInt;

	}
	
	int largest = -1000;
	for (int i = 0; i<rData.length; i++) {
	    if (largest < rData[i]) {
		largest = rData[i];
	    }
	}
	
	
	System.out.println(largest);
    }
}
