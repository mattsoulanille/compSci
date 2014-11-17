/**
  * Purse.java program
  * @author Matthew Soulanille
  * @version 2014-11-14
*/

import java.util.Collections;
import java.util.ArrayList;

public class Purse
{
    private ArrayList<String> coins;

    public Purse()
    {
	coins = new ArrayList<String>();
    }

    public void addCoin(String coinName)
    {
	coins.add(coinName);
    }

    public String toString()
    {
	String strcoins = "Purse[";

	if (coins.size() == 0) {
	    return "Purse[]";
	}

	for (String coin : coins) {
	    strcoins += coin;
	    strcoins += ",";
	}
	
	
	strcoins = strcoins.substring(0,strcoins.length()-1) + "]";

	return strcoins;
    }
    public void reverse()
    {
	ArrayList<String> reversed = new ArrayList<String>();
	for (int i = coins.size() - 1; i >= 0; i--) {
	    reversed.add(coins.get(i));
	}
	coins = reversed;
    }
    public void transfer(Purse fromHere)
    {
	for (String coin : fromHere.coins) {
	    this.addCoin(coin);
	}
	fromHere.coins.clear();

    }

    public boolean sameContents(Purse other)
    {
	return this.toString().equals(other.toString());
    }

    public boolean sameCoins(Purse other)
    {
	ArrayList<String> a = new ArrayList<String>(this.coins);
	ArrayList<String> b = new ArrayList<String>(other.coins);
	Collections.sort(a);
	Collections.sort(b);
	return a.toString().equals(b.toString());
    }
}
