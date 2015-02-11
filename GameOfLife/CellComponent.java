/** 
 * CellComponent.java
 * @author Matthew Soulanille
 * @version 2013-09-11
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class CellComponent extends JComponent
{
    private Rectangle cell;
    private int[] position = new int[] {0,0};
    private Graphics2D g2;
    public void paintComponent(Graphics g)
    {
	g2 = (Graphics2D) g;
    }

    public void live() {
	cell = new Rectangle(position[0]*10, position[1]*10, 10, 10);
	g2.fill(cell);
    }

    public void dead() {

    }

    public void setPosition(int x, int y) {
	position[0] = x;
	position[1] = y;
    }
}
