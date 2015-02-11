
/**
 * ShakespeareChecker.java
 * 
 * @author msoulanille
 * @version 02-06-2014
 */

public class ShakespeareChecker
{
    // instance variables
    public String base;                                       
    private final String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", 
                                                    "g", "h", "i", "j", "k", "l", 
                                                    "m", "n", "o", "p", "q", "r", 
                                                    "s", "t", "u", "v", "w", "x", 
                                                    "y", "z"};
    /*
     * Constructor 
     * 
     * Takes an original string and removes all spaces and punctuation so that 
     * we can compare it to a string of random letters.
     * 
     * @param originalString  the full-length String we are looking for
     */
    public ShakespeareChecker(String originalString)
    {
        // 
        this.base = "";
        for (int i = 0; i < originalString.length(); i ++) 
        {
            String letter = originalString.substring(i, i+1).toLowerCase();
            for (String x : alphabet) 
            {
                if(letter.equals(x)) 
                {
                    this.base += letter;
                }
            }
        }
    }

    /*
     * Accessor method
     * 
     * @param toCheck   the String we are trying to compare to the base
     * @return          a boolean: true if they are the same; false if they are different
     */
    public boolean checkText(String toCheck)
    {
        return toCheck.equals(base);
    }
}
    
