public class BitcoinAccount
{
    public final double RATE = 379.04;
    private double coins;
    public BitcoinAccount(double myCoins)
    {
	coins = myCoins;
    }

    public double balance()
    {
	return coins;
    }
    
    public void deposit(double myBitCoins)
    {
	coins += myBitCoins;
    }
    public double btc2usd(double dollarsPerBitcoin)
    {
	return coins*dollarsPerBitcoin;
    }

}
