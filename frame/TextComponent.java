import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class TextComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
	Graphics2D g2 = (Graphics2D) g;

	g2.drawString("abc", 25, 25);
    }
}

    
