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
import javax.swing.JButton;             // needed to create a button
import javax.swing.JPanel;              // user interface components go


public class SaveTheWorld
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;
    private static int counter = 10;
    private static double rate = 1.0;
    public static void main(String[] args)
    {
        // Initialize the Frame and Label, and add frame to label
        final JLabel label = new JLabel("",JLabel.CENTER);
        JFrame frame = new JFrame();
        JButton button = new JButton("Save the world");
	JPanel panel = new JPanel();
        panel.add(label);
	panel.add(button);
	frame.add(panel);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("This is how the world ends");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	rate = 1.0;
	final Timer t;

        class TimerListener implements ActionListener
        {
            // actionPerformed must be defined for an ActionListener
            public void actionPerformed(ActionEvent event)
            {
                counter = counter - (int)Math.floor(rate);             // Changes the counter value
		rate += 0.1;
                label.setText(String.valueOf(counter));   // Sets the value of the label
                                                                // so we can see it on screen
                if (counter < 0)
                {
		    t.stop();
		    label.setText("You Failed!");
                }
            }
        }


	
	ActionListener listener = new TimerListener();  // Initialize Listener object
	final int DELAY = 1000;                         // Milliseconds between timer ticks
        t = new Timer(DELAY, listener);           // Initialize Timer object

        /* The TimerListener is used to track time */
	class ButtonListener implements ActionListener
	{
	    // actionPerformed must be defined for an ActionListener
            public void actionPerformed(ActionEvent event)
            {
		
		//t.stop();
		//label.setText("You saved the world. Good job");
		counter ++;
		label.setText(String.valueOf(counter));   // Sets the value of the label
            }
        }  


        ActionListener buttonListener = new ButtonListener(); // our implementation!
        button.addActionListener(buttonListener);             // the addActionListener method

        

        t.start();                                      // Start the clock!
        
        frame.setVisible(true);                         // Display the window on screen!
        
    }
}
