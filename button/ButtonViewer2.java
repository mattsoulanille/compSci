/**
 * An example of setting up a button.
 * @author Richard White
 * @version 2015-02-03
 */

import javax.swing.JFrame;              // needed for graphics window
import javax.swing.JButton;             // needed to create a button
import javax.swing.JLabel;              // needed to create output on frame
import javax.swing.JPanel;              // user interface components go
                                        // on a panel
import java.awt.event.ActionEvent;      
import java.awt.event.ActionListener;   // need to capture events
import java.util.Random;

public class ButtonViewer2
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private static final Random generator = new Random();

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click to roll!");
        JPanel panel = new JPanel();
        final JLabel label = new JLabel(); // is final so inner class can use them.

        panel.add(button);
        panel.add(label);
        frame.add(panel);

        // START OF INNER CLASS!
        class ClickListener2 implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                int dieRoll = generator.nextInt(6) + 1;
                label.setText(String.valueOf(dieRoll));
            }
        }
        // END OF INNER CLASS

        
        ActionListener listener = new ClickListener2(); // our implementation!
        button.addActionListener(listener);             // the addActionListener method
                                                        // attaches a listener to a button

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
