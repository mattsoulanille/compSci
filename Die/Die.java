/**
  * Die.java program
  * @author Matthew Soulanille
  * @version 2015-01-28
*/

import java.lang.Math;

public class Die implements Measurable
{
    private double value;
    public Die()
    {
	
    }

    public void cast()
    {
	value = Math.ceil(Math.random() * 6);
    }

    public double getMeasure()
    {
	return value;
    }
}
	

	
