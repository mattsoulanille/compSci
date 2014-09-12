/**
  * ReplaceTester.java program
  * @author Matthew Soulanille
  * @version 2014-09-11
*/

class ReplaceTester
{
    public static void main(String[] args)
    {
	String myStr = new String("Mississippi");
	String replaced = myStr.replace("i", "!").replace("s", "$");
	System.out.println("Actual result:   " + replaced);
	System.out.println("Expected result: M!$$!$$!pp!");
    }
}
	    
