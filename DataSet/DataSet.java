/**
  * DataSet.java program
  * @author Matthew Soulanille
  * @version 2015-01-28
*/

public class DataSet
{
    private double sum;
    private double max;
    private int count;
    private double min;
    public DataSet() {
	sum = 0;
	max = Double.MIN_VALUE;
	min = Double.MAX_VALUE;
	count = 0;
    }

    public void add(Measurable x) {
	sum += x.getMeasure();
	if (x.getMeasure() > max) {
	    max = x.getMeasure();
	}
	if (x.getMeasure() < min) {
	    min = x.getMeasure();
	}
	count ++;
    }

    public double getAverage() {
	if (count > 0) {
	    return sum / count;
	}
	else {
	    return 0;
	}
    }

    public double getMaximum() {
	return max;
    }
    
}
    
