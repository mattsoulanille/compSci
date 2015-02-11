/**
  * SelectSort.java program
  * @author Matthew Soulanille
  * @version 2014-12-15
*/

import java.lang.Math;


public class SelectSort
{
    public static final int range = 1000;
    public static void main(String args[])
    {
	
	int[] nums = new int[range];
	for (int i = 0; i < range; i++) {
	    nums[i] = (int) Math.ceil(Math.random() * 1000);
	}

	int[] sorted = new int[range];
	int min = Integer.MAX_VALUE;
	int j;
	for (int i = 0; i < range; i++) {

	    j = i;
	    min = Integer.MAX_VALUE;
	    while (j < range) {
		if (nums[j] < min) {
		    min = nums[j];
		}
		j ++;
	    }
	}
	for(int x : sorted) {
	    System.out.println(x);
	}
    }
}
