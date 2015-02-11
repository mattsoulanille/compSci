public class BankAccount
{
    private double balance;
    private int aNum;
    public BankAccount(int aNum)
    {
	this.aNum = aNum;
	balance = 0;
    }
    public BankAccount(int aNum, double balance)
    {
	this.aNum = aNum;
	this.balance = balance;
    }
    public int getAccountNumber() {
	return aNum;
    }
    public void deposit(double amount)
    {
	balance += amount;
    }
    public void withdraw(double amount)
    {
	balance -= amount;
    }
    public double getBalance()
    {
	return balance;
    }
}
