/**
  * RandomDataAnalyzer.java program
  * @author Matthew Soulanille
  * @version 2014-10-30
*/
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
public class RandomData
{
    public double average;
    public double max;
    public ArrayList<Double> database = new ArrayList<Double>(100);

    public RandomData() {
	for (int i = 0; i < 100; i++) {
	    database.add(Math.random() * 1000);
	}
	double average = 0;
	for (int i = 0; i < 100; i++) {
	    average += (double) database.get(i);
	}
	average = average/100;
	max = Collections.max(database);
    }
    public void getData() {
	System.out.println("Average is: " + average);
	System.out.println("Max is: " + max);

    }
}	
