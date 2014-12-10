
/**
 * CashRegister class from Horstmann, Ch 4.
 * 
 * @author Richard White
 * @version 2013-09-22
 */
public class CashRegister
{

    
    private double purchase;
    private double payment;

    /**
     * Constructs a cash register with no money in it. :(
     */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }
    
    /**
     * Records the purchase price of an item
     * @param amount the price of an item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }

    public void enterPayment(int cCount, Coin coinType)
    {
	payment += coinType.getValue() * cCount;
    }

    /**
     * Computes the change due and resets machine for the next customer.
     * @return the change due the customer
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
