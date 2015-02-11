/**
 * Experiment.java
 * 
 * @author mossem
 * @version 02-06-15
 */

import java.util.Scanner;

public class Experiment
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // explaining the infinite monkey theorem
        System.out.println("The infinite monkey theorem states that a monkey hitting keys at random on a ");
        System.out.println("typewriter keyboard for an infinite amount of time will almost surely type a"); 
        System.out.println("given text, such as the complete works of William Shakespeare.");
        System.out.println("");
        System.out.println("We're going to give it a shot!");
        System.out.println("Enter shakespeare text for our monkeys to type: ");
        String textToFind = in.nextLine();
        // length of textToFind stored in sourceTextLength for later use
        int sourceTextLength = textToFind.length();
        
        //ask user if they want us to print out the random text as we seach
        System.out.println("Got it. Want to see the random text as the monkeys type? It'll take them much longer! (y/n)");
        String textVisible = in.nextLine();
        if (textVisible.equalsIgnoreCase("n"))
        {
            System.out.println("Alrighty then. Want to at least see how many characters are being generated? (y/n)");
        }
        String numsVisible = in.nextLine();
        if (textVisible.equalsIgnoreCase("y"))
            System.out.println("Alrighty then. Press 'enter' to start the experiment.");
        System.out.println("Ok. The monkeys are typing...");
        
        /* START OF THE EXPERIMENT */
        
        // the string of random text that we'll be checking
        String monkeyText = "";
        
        // monkeyTypewriter will be making our random characters
        Typewriter monkeyTypewriter = new Typewriter();
        // monkeyTextChecker will be comparing monkeyText to textToFind (and will ignore punctiation,
        //                                                                 capitalization, and spacing)
        ShakespeareChecker monkeyTextChecker = new ShakespeareChecker(textToFind);
        
        // we're keeping track of how many letters have been generated
        int letterCount = 0;
        
        // make a string of the same size as textToFind
        for (int i = 0; i < sourceTextLength; i++)
        {
            monkeyText += monkeyTypewriter.nextLetter();
            letterCount ++;
        }
        
        // add a random letter to the string, remove the first letter, and compare
        while (true)
        {
            if (textVisible.equalsIgnoreCase("y"))
            {
                System.out.println(monkeyText);
            }
            
            if (numsVisible.equalsIgnoreCase("y"))
            {
                System.out.println(letterCount);
            }
            
            // if the two pieces of the text are the same
            if (monkeyTextChecker.checkText(monkeyText) == true)
            {
                // print the bit of hamlet that we found
                System.out.println(monkeyText);
                break;
            }
            
            // add a random letter, increment letterCount, and cut off the last letter
            monkeyText += monkeyTypewriter.nextLetter();
            letterCount ++;
            monkeyText = monkeyText.substring(monkeyText.length() - sourceTextLength);
        }
        
        System.out.println("'" + textToFind + "'" + " was randomly typed after " + 
                            letterCount + " random letters were generated.");
    }
}
