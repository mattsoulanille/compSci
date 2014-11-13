/**
  * Censor.java program for bad words
  * @author Matthew Soulanille
  * @version 2014-11-12
*/
import java.util.Scanner;
public class Censor
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("input: ");
	String input = sc.next();
	char[] output = input.toCharArray();
	String[] badWords = new String[] {"poopoothsnake", "damn", "damm", "stupid", "idiot", "poop", "useless"};

	
	
	String badWord;
	for (int i = 0; i < badWords.length; i++) {

	    badWord = badWords[i];
	    for (int j = 0; j + badWord.length() < input.length() + 1; j++) {

		if (input.substring(j,j+badWord.length()).equals(badWord)) {

		    for (int k = 0; k < badWord.length(); k++) {
			output[k+j] = '*';
		    }
		}
	    }
	}
	System.out.println(output);
    }

}
			
		    

		
	
	
