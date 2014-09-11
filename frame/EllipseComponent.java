/** 
 * EllipseComponent.java
 * @author Matthew Soulanille
 * @version 2013-09-11
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class EllipseComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;
    
        // Construct Ellipse
        Ellipse2D.Float bubble = new Ellipse2D.Float();
        // ... and don't forget to draw it!
        //g2.draw(bubble);
	int x = 0;
	while (x < 15)
	{
	    bubble.setFrame(100, 100, 50*x, 40*x);
	    //	    g2.setColor(10*x, 20*x, 30*x);
	    //	    g2.fill(bubble);
	    g2.draw(bubble);
	    x = x + 1;
	}
		
	    
        
	
        // ... and don't forget to draw it!
        //g2.draw(bubble);   
    }
}
