/**
  * Card.java program
  * @author Matthew Soulanille
  * @version 2014-10-09
*/

import java.util.HashMap;

public class Card
{
    public String c;
    public HashMap<String, String> cardType;
    public HashMap<String, String> suit;
    public Card(String c)

    {
	this.c = c;
	cardType = new HashMap<String, String>(13);
	cardType.put("A", "Ace");
	cardType.put("2", "Two");
	cardType.put("3", "Three");
	cardType.put("4", "Four");
	cardType.put("5", "Five");
	cardType.put("6", "Six");	
	cardType.put("7", "Seven");
	cardType.put("8", "Eight");
	cardType.put("9", "Nine");
	cardType.put("10", "Ten");
	cardType.put("J", "Jack");
	cardType.put("Q", "Queen");
	cardType.put("K", "King");
	
	suit = new HashMap<String, String>(4);
	suit.put("C", "Clubs");
	suit.put("D", "Diamonds");
	suit.put("S","Spades");
	suit.put("H","Hearts");
    }
    
    public String getDescription()
    {
	String n;
	String s;
	if (c.length() == 2) {
	    n = c.substring(0,1).toUpperCase();
	    s = c.substring(1, 2).toUpperCase();
	}
	else if (c.length() == 3) {
	    n = c.substring(0,2).toUpperCase();
	    s = c.substring(2,3).toUpperCase();
	}
	// I could do this in python with not if statements :P
	else {
	    return "Unknown";
	}
	if ((cardType.get(n) == null) || (suit.get(s) == null)) {
	    return "Unknown";
	}
	return cardType.get(n) + " of " + suit.get(s);
	

    }

}
    
