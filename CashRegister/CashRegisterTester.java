/**
 * Tester for CashRegister class from Horstmann, Ch 4.
 * 
 * @author Matthew Soulanille
 * @version 2013-09-29
 */

public class CashRegisterTester
{

    public static void main(String args[])
    {
	Coin quarter = new Coin(0.25, "Quarter");
	Coin dime = new Coin(0.1, "Dime");
	Coin dogecoin = new Coin(0.0002182, "Dogecoin");
	    
	CashRegister walmart = new CashRegister();
	walmart.recordPurchase(41.34);
	walmart.enterPayment(50000, dogecoin);
	walmart.enterPayment(100, dime);
	walmart.enterPayment(100, quarter);
	System.out.printf("%.2g%n", walmart.giveChange());
    }
}
