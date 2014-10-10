/**
  * MonthTester.java program
  * @author Matthew Soulanille
  * @version 2014-10-10
*/
public class MonthTester
{

    public static void main(String[] args)
    {
	int choice = Integer.parseInt(args[0]);
	Month a = new Month();
	System.out.println(a.getDays(choice));
    }
}

