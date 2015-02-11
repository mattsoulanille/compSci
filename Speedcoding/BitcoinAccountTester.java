
/**
 * BitcoinAccountTester for SpeedCoding2 activity.
 * 
 * @author Richard White 
 * @version 2013-11-27
 */
public class BitcoinAccountTester
{
    final static double EPSILON = 1E-12;
     
    public static void main(String[] args)
    {
        
        int testsPassed = 0;
        BitcoinAccount testAccount = new BitcoinAccount(1);
        if (testAccount.balance() == 1) testsPassed++;
        
        testAccount.deposit(0.4);
        if (Math.abs(testAccount.balance() - 1.4) < EPSILON) testsPassed++;
        
        if (Math.abs(testAccount.btc2usd(200) - 280) < EPSILON) testsPassed++;
        System.out.println("Tests Passed: " + testsPassed + "/3");
    }
}
