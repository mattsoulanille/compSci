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
	CashRegister walmart = new CashRegister();
	walmart.recordPurchase(41.34);
	walmart.enterPayment(40, 5, 4, 3, 2);
	System.out.printf("%.2g%n", walmart.giveChange());
    }
}
