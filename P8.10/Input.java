/**
  * Input.java program
  * @author Matthew Soulanille
  * @version 2015-01-05
*/
import java.util.Scanner;
public class Input
{
    public static int readInt(Scanner in, String prompt,
			      String error, int min, int max)
    {
	System.out.println(prompt);
	int value = in.nextInt();
	
	while ((value > max) || (value < min)) {
	    System.out.println(error);
	    System.out.println(prompt);
	    value = in.nextInt();
	}
	return value;
    
    }
}
