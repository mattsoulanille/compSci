/**
  * GregCal.java program
  * @author Matthew Soulanille
  * @version 2014-09-12
*/

import java.util.GregorianCalendar;
import java.util.Calendar;
//import java.util.Dictionary;

public class GregCal
{
    public static void main(String[] args)
    {
	/**
	Dictionary weekday = new Dictionary();

	weekday.put(1, "Monday");
	weekday.put(2, "Tuesday");
	weekday.put(3, "Wednesday");
	weekday.put(4, "Thursday");
	weekday.put(5, "Friday");
	weekday.put(6, "Saturday");
	weekday.put(7, "Sunday");
	*/
	GregorianCalendar today = new GregorianCalendar();
	System.out.println("Date today: "+today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH) + 1) + "-" + today.get(Calendar.DAY_OF_MONTH));
	
	today.add(Calendar.DAY_OF_MONTH, 100);
	System.out.println("Date 100 days later: "+today.get(Calendar.YEAR) + "-" + (today.get(Calendar.MONTH) + 1) + "-" + today.get(Calendar.DAY_OF_MONTH) + " and it is weekday " + today.get(Calendar.DAY_OF_WEEK));
	GregorianCalendar bday = new GregorianCalendar(1996, 11, 23);
	System.out.println("My birthday was on the weekday " + bday.DAY_OF_WEEK);



	bday.add(Calendar.DAY_OF_MONTH, 10000);
	System.out.println("Date 10000 days later from my birthday: "+bday.get(Calendar.YEAR) + "-" + (bday.get(Calendar.MONTH) + 1) + "-" + bday.get(Calendar.DAY_OF_MONTH) + " and it is weekday " + bday.get(Calendar.DAY_OF_WEEK));

    }
}
