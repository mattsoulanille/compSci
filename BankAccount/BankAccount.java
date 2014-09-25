/**
  * BankAccount.java program
  * @author Matthew Soulanille
  * @version 2014-09-24
*/

public class BankAccount
{
    private double balance;

    public BankAccount()
    {
	balance = 0;
    }
    public BankAccount(double money)
    {
	balance = money;
    }
    public void deposit(double money)
    {
	assert money > 0 : "Can't deposit negative money";
	balance += money;
    }
    public void withdraw(double money)
    {
	assert money > 0 : "Can't withdraw negative money";
	assert balance - money >= 0 : "Not enough balance";
	balance = balance - money;
    }
    public void addInterest(double interest)
    {
	balance = balance * (interest/100 + 1);

    }
    public double getBalance()
    {
	return balance;
    }
}

