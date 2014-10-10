/**
  * YesNoChecker.java program
  * @author Matthew Soulanille
  * @version 2014-10-10
*/

import java.util.ArrayList;

public class YesNoChecker
{
    public ArrayList<String> yes;
    public ArrayList<String> no;

    public YesNoChecker()
    {
	yes = new ArrayList<String>(5);
	yes.add("y");
	yes.add("yes");
	yes.add("ok");
	yes.add("sure");
	yes.add("why not?");

	no = new ArrayList<String>(2);
	no.add("n");
	no.add("no");

    }
    public String getInput(String in)
    {
	in = in.toLowerCase();
	if (yes.contains(in)) {
	    return "OK";

	} else if (no.contains(in)) {
	    return "Terminating";
	} else {
	    return "Bad input";
	}
    }
}
