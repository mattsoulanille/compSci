/**
  * BankAccountTester.java program
  * @author Matthew Soulanille
  * @version 2014-09-24
*/



public class BankAccountTester
{


    public static void main(String args[])
    {
	BankAccount test = new BankAccount();
	test.deposit(1000);
	test.withdraw(500);
	test.withdraw(400);
	System.out.println("Got: " + test.getBalance());
	System.out.println("Expected: 100");
    }
}
