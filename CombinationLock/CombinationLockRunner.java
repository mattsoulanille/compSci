/**
  * CombinationLockRunner.java program
  * @author Matthew Soulanille
  * @version 2014-10-16
*/

import java.util.Scanner;

public class CombinationLockRunner
{
    
    public static void main(String[] args)
    {
	CombinationLock lock = new CombinationLock("QED");
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 3 letter combo: ");
	String combo = sc.next();
	while (true) {
	    if (combo.length() == 3) {
		lock.selectLetter( combo.substring(0, 1));
		lock.selectLetter( combo.substring(1, 2));
		lock.selectLetter( combo.substring(2, 3));
		boolean open = lock.openLock();
		if (open) {
		    System.out.print("\n Success");
		}
		else {
		    System.out.print("\n Fail");
		}
		
	    }
	
	}
    }
}
