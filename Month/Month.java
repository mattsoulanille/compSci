/**
  * Month.java program
  * @author Matthew Soulanille
  * @version 2014-10-10
*/



import java.util.ArrayList;
public class Month
{
    public ArrayList<String> days;    
    public String answer;

    public Month()
    {
	days = new ArrayList<String>(12);
	days.add("31");
	days.add("28");
	days.add("31");
	days.add("30");
	days.add("31");
	days.add("30");
	days.add("31");
	days.add("31");
	days.add("30");
	days.add("31");
	days.add("30");
	days.add("31");
	
    }
    public String getDays(int month)  
    {
	month -= 1;
	answer = days.get(month) + " days";
	return answer;

    }
}
