
/**
 * Typewriter.java
 * 
 * @author mossem
 * @version 02-06-2014
 */

import java.util.Random;

public class Typewriter
{
    // instance variable
    private Random generator;
    
    /*
     * Constructor
     */
    public Typewriter()
    {
        generator = new Random();
    }
    
    /*
     * Accessor Method
     * 
     * @return  a random letter from the alphabet
     */
    public String nextLetter()
    {
        int x = generator.nextInt(25);
        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                                          "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        return alphabet[x];
    }
}
