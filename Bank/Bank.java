import java.util.ArrayList;

public class Bank
{
    private ArrayList<BankAccount> accounts;
    public Bank()
    {
	accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount a)
    {
	accounts.add(a);
    }
    public void addAccount(int aNum, double balance)
    {
	BankAccount a = new BankAccount(aNum, balance);
	accounts.add(a);
	
    }
    public double getBalance(int aNum)
    {
	BankAccount account = find(aNum);
	return account.getBalance();	    
	
    }
    public double getTotalBalance()
    {
	double total = 0;
	for (BankAccount a : accounts) {
	    total += a.getBalance();
	}
	return total;
    }
    public int count(double atLeast)
    {
	int matches = 0;
	for (BankAccount a : accounts) {
	    if (a.getBalance() >= atLeast) { matches ++;}
	}
	return matches;
    }
    public BankAccount find(int accountNumber)
    {
	for (BankAccount a : accounts) {
	    if (a.getAccountNumber() == accountNumber) return a;
	}
	return null;
    }
    public BankAccount getMaximum()
    {
	if (accounts.size() == 0) {
	    return null;
	}
	BankAccount large = accounts.get(0);
	for (int i=1; i<accounts.size(); i++) {
	    BankAccount a = accounts.get(i);
	    if (a.getBalance() > large.getBalance()) {
		large = a;
	    }
	}
	return large;
    }

    public boolean deposit(int aNum, double money)
    {
	if (this.find(aNum) == null) {
	    return false;
	}
	BankAccount account = this.find(aNum);

	account.deposit(money);
	return true;
    }
    public boolean withdraw(int aNum, double money)
    {
	if (this.find(aNum) == null) {
	    return false;
	}

	BankAccount account = this.find(aNum);
	account.withdraw(money);
	return true;
    }
    
}	   
