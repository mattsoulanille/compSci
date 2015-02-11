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

public class BallRunner
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("Watch it go!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final BallComponent component = new BallComponent(20,20,3,2,30, WIDTH, HEIGHT);
        frame.add(component);
        
        frame.setVisible(true);
        
        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                component.move();
            }
        }
        
        ActionListener timeListener = new TimerListener();
        
        final int DELAY = 20;
        Timer t = new Timer(DELAY, timeListener);
        t.start();
        
    }
}
