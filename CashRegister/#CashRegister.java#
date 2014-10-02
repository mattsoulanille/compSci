
/**
 * CashRegister class from Horstmann, Ch 4.
 * 
 * @author Richard White
 * @version 2013-09-22
 */
public class CashRegister
{
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
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
    
    /**
     * Enters the payment received from the customer.
     * @param dollars the number of dollars in the payment
     * @param quarters "    " 
     * @param dimes    "    "
     * @param nickels  "    "
     * @param pennies  "    "
     */
    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
            payment = dollars +
                      quarters * QUARTER_VALUE +
                      dimes * DIME_VALUE +
                      nickels * NICKEL_VALUE +
                      pennies * PENNY_VALUE;
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
