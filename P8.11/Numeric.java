/**
  * Numeric.java program
  * @author Matthew Soulanille
  * @version 2015-01-05
*/
import java.lang.Math;
public class Numeric
{
    public static double intPower(double x, int n)
    {
	if (n < 0) {
	    return 1/Math.pow(x, n*-1);
	}
	else {
	    if (n % 2 == 0) {
		return Math.pow(Math.pow(x, n*0.5), 2);
	    }
	    else {
		return Math.pow(x, n-1) * x;
	    }
	}
    }
}
