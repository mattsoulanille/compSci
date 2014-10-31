/**
  * PrimeGenerator.java program
  * @author Matthew Soulanille
  * @version 2014-10-30
*/
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;
public class PrimeGenerator
{
    public HashMap<Integer, Boolean> sieve;
    public int counter = 0;
    public int limit;
    public int firstLimit = 100;
    public ArrayList<Integer> answers;

    public PrimeGenerator()	
    {

	calculate(firstLimit);
    }

    public void calculate(int limit) {
	this.limit = limit;
	sieve = new HashMap<Integer, Boolean>(limit);
	for (int i = 1; i <= limit; i++) {
	    sieve.put(i, false);
	}

	int n;
	
	for (int x = 1; x < Math.pow(limit,0.5); x++) {
	    for (int y = 1; y < Math.pow(limit,0.5); y++) {
		n = 4*x*x+y*y;
		if ((n <= limit) && (n % 12 == 1 || n % 12 == 5)) {
		    sieve.put(n, !sieve.get(n));
		}
		n = 3*x*x + y*y;
		if ((n <= limit) && (n % 12 == 7)) {
		    sieve.put(n, !sieve.get(n));
		}
		n = 3*x*x-y*y;
		if ((x>y) && (n <= limit) && (n % 12 == 11)) {
		    sieve.put(n, !sieve.get(n));
		}
	    }
	}
	for (int p = 5; p <= Math.pow(limit,0.5); p ++) {
	    if (sieve.get(p)) {
		for (int k = p*p; k < limit; k += p*p) {
		    sieve.put(k,false);
		}
	    }
	}
	answers = new ArrayList<Integer>(limit);
	answers.add(2);
	answers.add(3);
	for (int p = 5; p <= limit; p++) {
	    if (sieve.get(p)) {
		answers.add(p);
	    }
	}


    }
    public int nth = 0;
    public int nextPrime() 
    {
	nth += 1;
	if (nth > answers.size() - 1) {
	    calculate(limit + 1000);
	}
	return answers.get(nth - 1);
	
	
    }
    

}
