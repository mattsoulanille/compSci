
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class RainbowComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;

	Ellipse2D.Float rainbow = new Ellipse2D.Float();
	g2.setColor(Color.red);
	int[] origin = new int[] {400, 600};
	int outerRadius = 400;
	int innerRadius = 350;

	Color[] colors = new Color[] {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.pink, Color.white}; // They don't have purple!!!

	int delta = (outerRadius - innerRadius) / (colors.length - 1); //-1 because white
	int radius = outerRadius;
	for (int x = 0; x < colors.length; x ++) {
	    g2.setColor(colors[x]);
	    rainbow.setFrame(origin[0] - outerRadius + delta * x,
			     origin[1] - outerRadius + delta * x,
			     2 * (outerRadius - delta * x),
			     2 * (outerRadius - delta * x));
	    g2.draw(rainbow);
	    g2.fill(rainbow);
	}
    }
}
