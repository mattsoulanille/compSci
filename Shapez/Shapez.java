/**
  * Shapez.java program
  * @author Matthew Soulanille
  * @author Richard White
  * @version 2015-02-04
*/


import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.Shape;
import java.lang.Math;

public class Shapez
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();  // constructing a Frame
	//	frame.setLayout(new FlowLayout());
	
	final int x = 800;
	final int y = 600;
        frame.setSize(x,y);       // (pixels across, pixels down)
        frame.setTitle("My Frame, Eh?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	class randomShapesComponent extends JComponent
	{
	    public void paintComponent(Graphics g)
	    {
		Color[] colors = new Color[] {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.pink, Color.white, Color.gray, Color.black}; // They don't have purple!!!
		int count = 1000;
		// Recover Graphics 2D
		Graphics2D g2 = (Graphics2D) g;
		Shape[] shapes = new Shape[count];
		for (int n = 0; n < count; n++) {
		    if (Math.random() < 0.5) {
			Ellipse2D.Float ellipse = new Ellipse2D.Float();
			ellipse.setFrame(Math.random() *x, Math.random()*y, Math.random() *x, Math.random()*y);
			shapes[n] = ellipse;
		    } else {
			Rectangle2D.Float rectangle = new Rectangle2D.Float();
			rectangle.setFrame(Math.random() *x, Math.random()*y, Math.random() *x, Math.random()*y);
			shapes[n] = rectangle;
		    }
		}

		
		//		shapes[0].setFrame(100, 100, 50, 40);
		//		shapes[1].setFrame(300, 200, 40, 60);
		    
		for(Shape s : shapes) {
		    g2.setColor(colors[(int)Math.floor(Math.random() * 9)]);
		    g2.draw(s);
		}

	    }
	}


	
        // We'll construct something to be viewed here in a minute
	//	RectangleComponent myBox = new RectangleComponent();
	//	EllipseComponent myEllipse = new EllipseComponent();
	randomShapesComponent shapes = new randomShapesComponent();
	//	TextComponent text = new TextComponent();
        // We'll add the thing that we've constructed to the frame here
	//	frame.add(text);
	frame.add(shapes);
	//	frame.add(myBox);

	//frame.add(myEllipse);
    
        // Now we need to show the frame
        frame.setVisible(true);

    }
    
}
