/**
  * Coin.java program
  * @author Matthew Soulanille
  * @version 2014-12-08
*/

public class Coin
{
    private double value;
    private String name;
    public Coin(double value, String name)
    {
	this.value = value;
	this.name = name;
    }

    public String getName()
    {
	return this.name;
    }
    
    public double getValue()
    {
	return this.value;
    }
}
