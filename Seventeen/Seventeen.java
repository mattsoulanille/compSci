/**
  * Seventeen.java program
  * @author Matthew Soulanille
  * @version 2014-11-19
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Seventeen
{
    public static Random rand = new Random();
    public static void main(String[] args)
    {

	int[] count = new int[100];

	for (int i = 0; i < 1000; i++) {
	    count[rand.nextInt(100)] += 1;
	}
	for (int i = 0; i < 100; i++) {
	    System.out.println(i + " : " + count[i]);
	}
    }
}
		

	
