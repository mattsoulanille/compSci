/**
 * This program creates a countdown timer and displays it on screen.
 * @author Richard White
 * @version 2015-02-05
 */

import java.awt.event.ActionEvent;      // used to identify trigger action
import java.awt.event.ActionListener;   // helps to create our timer
import javax.swing.JFrame;              // creates window on screen
import javax.swing.JLabel;              // needed to create output
import javax.swing.Timer;
import java.util.Date;

public class date
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;
    private static int counter = 10;

    public static void main(String[] args)
    {
        // Initialize the Frame and Label, and add frame to label
        final JLabel label = new JLabel("",JLabel.CENTER);
        JFrame frame = new JFrame();
        frame.add(label);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("This is what time it is");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* The TimerListener is used to track time */
        class TimerListener implements ActionListener
        {
            // actionPerformed must be defined for an ActionListener
            public void actionPerformed(ActionEvent event)
            {
                label.setText(String.valueOf(new Date()));   // Sets the value of the label
            }
        }
        
        ActionListener listener = new TimerListener();  // Initialize Listener object
        final int DELAY = 1000;                         // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);           // Initialize Timer object
        t.start();                                      // Start the clock!
        
        frame.setVisible(true);                         // Display the window on screen!
        
    }
}
