/**
 * Listens for the click of a button
 * @author Richard White
 * @version 2015-02-03
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
	System.out.println("I told you not to click me!");
    }
}
