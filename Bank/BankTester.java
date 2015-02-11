public class BankTester
{
    public static void main(String[] args)
    {
	Bank b = new Bank();
	b.addAccount(new BankAccount(1001,20000));
	b.addAccount(new BankAccount(1015,10000));
	b.addAccount(new BankAccount(1729,15000));

	double threshold = 15000;
	int c = b.count(threshold);
	System.out.println("count: " + c);
	System.out.println("Expected: 2");

	int anum = 1015;
	BankAccount a = b.find(anum);
	if (a == null) {
	    System.out.println("can't find account");
	} else {
	    System.out.println("Balance is: " + a.getBalance());
	}
	System.out.println("expected 10000");

	BankAccount max = b.getMaximum();
	System.out.println("Account w/ largest balance is: " + max.getAccountNumber());
	System.out.println("expected: 1001");
    }
}
	
