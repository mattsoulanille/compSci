/**
 * The class BallRunner class constructs a Ball, sets up a component,
 * and displays the ball's motion on the screen.
 * @author Richard White
 * @version 2015-02-08
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;


public class BallRunner
{
    // public static final int WIDTH = 800;
    // public static final int HEIGHT = 600;
    private static Rectangle dimensions;
    public static void main(String[] args)
    {
        final JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("Resize me!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	dimensions = frame.getBounds();
        
        final BallComponent component = new BallComponent(20,20,3,2,30, dimensions.width, dimensions.height);
        frame.add(component);
        
        frame.setVisible(true);
        
        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                component.move();
            }
        }
	/*
        class PrintListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {

            }
        }
	*/
	class ResizeListener implements ComponentListener
	{
	    public void componentHidden(ComponentEvent e) {}
	    public void componentMoved(ComponentEvent e) {}
	    public void componentShown(ComponentEvent e) {}
	    
	    public void componentResized(ComponentEvent e) {
		dimensions = frame.getBounds();
		BallComponent.resizeCoords(dimensions.width, dimensions.height);
		System.out.println(dimensions.width + "  " + dimensions.height);
	    } 
	}

	frame.addComponentListener(new ResizeListener());
        
        ActionListener timeListener = new TimerListener();
	//	ActionListener printListener = new PrintListener();
	
        final int DELAY = 20;
        Timer t = new Timer(DELAY, timeListener);

	//	Timer print = new Timer(3000, printListener);
        t.start();
	//        print.start();
    }
}
