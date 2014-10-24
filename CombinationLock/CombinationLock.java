/**
  * CombinationLock.java program
  * @author Matthew Soulanille
  * @version 2014-10-14
*/



public class CombinationLock
{
    
    private String combo;
    private String tries;
    private boolean openness;


    public CombinationLock(String combo)
    {
	this.combo = combo.toUpperCase();
	this.tries = "";
	openness = false;
    }
    
    public void selectLetter(String selection)
    {
	if (selection.length() == 1) {
	    tries += selection.toUpperCase();
	    if (tries.length() > 3) {
		tries = tries.substring(1,4);
	    }
	}
    }
    public boolean openLock()
    {
	if (!openness) {
	    openness = (tries.equals(combo));
	    tries = "";
	}
	return openness;
    }

    public void closeLock() {
	openness = false;
    }

    public boolean isOpen()
    {
	return openness;
    }
    public void changeCombo(String letters)
    {
	if (openness) {
	    if (letters.length() == 3) {
		combo = letters.toUpperCase();
		return;
	    }
	}
	System.out.println("Can't change combo.");
    }
}
		
	
