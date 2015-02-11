/**
  * FibonacciGenerator.java program
  * @author Matthew Soulanille
  * @version 2014-10-23
*/

public class FibonacciGenerator
{
    private long a = 1;
    private long b = 1;
    private long c = 0;

    public FibonacciGenerator()
    {

    }
    public long nextNumber()
    {
	c = a+b;
	long out = a;
	a = b;
	b = c;
	return out;
    }
}
