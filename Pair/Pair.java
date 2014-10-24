/**
  * Pair.java program
  * @author Matthew Soulanille
  * @version 2014-10-02
*/
import java.util.Scanner;
import java.lang.Math;

public class Pair
{
    private double n1;
    private double n2;


    public Pair(double num1, double num2)
    {
	n1 = num1;
	n2 = num2;
    }

    public double getSum()
    {
	return n1 + n2;
    }

    public double getDifference()
    {
	return n1 - n2;
    }

    public double getDistance()
    {
	return Math.abs(n1 - n2);
    }
    
    public double getAverage()
    {
	return (n1 + n2) / 2;
    }

    public double getMax()
    {
	return Math.max(n1, n2);
    }

    public double getMin()
    {
	return Math.min(n1, n2);
    }
    
    public double getProduct()
    {
	return n1*n2;
    }
}
