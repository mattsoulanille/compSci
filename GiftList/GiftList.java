/**
 * The GiftList class allows you to manage your holiday shopping.
 * 
 * @author Richard White 
 * @version 2013-12-05
 */
import java.util.ArrayList;
import java.util.HashMap;

public class GiftList
{

    public ArrayList<HashMap<String,String>> gifts;

    /**
     * Constructor for objects of class GiftList
     */
    public GiftList()
    {
	gifts = new ArrayList<HashMap<String,String>>();
	
    }

    /**
     * addToList method adds a blank gift for someone
     * @param  theRecipient who gets the gift
     */
    public void addToList(String name)
    {
	HashMap<String,String> gift = new HashMap<String,String>();
	gift.put("Name",name);
	gift.put("Gift", "none");
	gift.put("Done", "not done");
		 
	gifts.add(gift);

    }
    /**
     * addToList method adds a known gift for someone
     * @param  theRecipient who gets the gift
     * @param  theGift the gift we're giving
     */
    public void addToList(String name, String giftName)
    {
	HashMap<String,String> gift = new HashMap<String,String>();
	gift.put("Name", name);
	gift.put("Gift", giftName);
	gift.put("Done", "not done");
	
	gifts.add(gift);
    }

        
    /**
     * getListEntry method identifies a Gift entry on the list by recipient
     * @param  theRecipient who gets the gift, or null if no recipient identified
     * @return the gift for that recipient, or null if no recipient identified 
     */
    public HashMap getListEntry(String name)
    {

	for (int i = 0; i < gifts.size(); i++) {
	    
	    if (gifts.get(i).get("Name").equals(name)) {
		return gifts.get(i);
	    }
	}
	return null;
    }

    /**
     * seeFullList method returns the entire list as a string in the following format
     * "recipientName-giftName-done" (or not done if not purchased)
     * @return  a string version of the list
     */

    public String seeFullList()
    {
	String toReturn = "";
	for (HashMap gift : gifts) {
	    toReturn += gift.get("Name");
	    toReturn += "-";
	    toReturn += gift.get("Gift");
	    toReturn += "-";
	    toReturn += gift.get("Done");
	    toReturn += "\n";
	}
	return toReturn;
    }

    /**
     * toPurchase method returns the a String with the recipients whose gifts haven't
     * been purchased yet. This list is returned in the format:
     * "recipientName-giftName"
     * @return  a string version of the list
     */
    public String toPurchase()
    {
	String toReturn = "";
	for (int i = 0; i < gifts.size(); i++) {
	    if (!gifts.get(i).get("Done").equals("done")) {
		toReturn += gifts.get(i).get("Name");
		toReturn += "-";
		toReturn += gifts.get(i).get("Gift");
		toReturn += "\n";
	    }
	}
	return toReturn;
    }

    /**
     * checkOffList method checks an item off the gift list
     * @param giftRecipient the person who's getting the gift
     * @return 1 if gift was successfully checked off, 0 if recipient not found, 
     *         -1 if there is no gift to check off
     */
    
    public int checkOffList(String person)
    {
	for (int i = 0; i < gifts.size(); i++) {
	    if (gifts.get(i).get("Name").equals(person)) {
		if (!gifts.get(i).get("Gift").equals("none")) {
		    gifts.get(i).put("Done", "done");
		    return 1;
		}
		return -1;
	    }
	    
	}
	return 0;
    }
    /**
     * beenNaughty method removes a recipient from the gift list
     * @param giftRecipient whose entry is to be stricken
     * @return 1 if recipient was removed, 0 if recipient not found
     */

    public int beenNaughty(String person)
    {
	
	for (int i = 0; i < gifts.size(); i++) {
	    if (gifts.get(i).get("Name").equals(person)) {
		gifts.remove(i);
		return 1;
	    }
	}
	return 0;
    }
    

        
    /**
     * editGift method edits the gift for someone
     * @param  theRecipient who gets the gift
     * @param  theGift the updated gift they'll be getting
     */

    public void editGift(String person, String newGift)
    {
	for (int i = 0; i < gifts.size(); i++) {
	    if (gifts.get(i).get("Name").equals(person)) {
		gifts.get(i).put("Gift", newGift);
	    }
	}
    }


}
