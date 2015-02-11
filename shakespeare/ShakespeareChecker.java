public class ShakespeareChecker
{
    public String base;
    private final String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    public ShakespeareChecker(String base)
    {
	this.base = "";
	for(int i = 0; i < base.length(); i ++) {
	    String letter = base.substring(i, i+1).toLowerCase();
	    for(String x : alphabet) {
		if(letter.equals(x)) {
		    this.base += letter;
		}
	    }
	}

    }

    public boolean checkText(String toCheck)
    {
	return toCheck.equals(base);
    }
}
	
