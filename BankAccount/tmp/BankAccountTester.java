/**
    BankAccountTester.java
    A class to test the BankAccount class.
    
    @author Richard White
    @version 013-04-14
*/

public class BankAccountTester
{
    /**
        Tests the methods of the BankAccount class.
        @param args not used
    */

    public static void main(String[] args)
    {
        BankAccount whitesChecking = new BankAccount();
        whitesChecking.deposit(2000);
        whitesChecking.withdraw(500);
        System.out.println(whitesChecking.getBalance());
        System.out.println("Expected: 1500.0");
        if (whitesChecking.getBalance() == 1500)
        {
            System.out.println("Test 1: passed");
        }
        else
        {
            System.out.println("Test 1: failed");
        }
        
        BankAccount schmokesSaving = new BankAccount(100);
        schmokesSaving.withdraw(50);
        schmokesSaving.withdraw(100);
        System.out.println(schmokesSaving.getBalance());
        System.out.println("Expected: -50.0");
        if (schmokesSaving.getBalance() == -50)
        {
            System.out.println("Test 2: passed");
        }
        else
        {
            System.out.println("Test 2: failed");
        }
    }
}
