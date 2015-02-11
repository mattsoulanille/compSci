/**
  * ButtonViewer.java program
  * @author Matthew Soulanille
  * @version 2015-02-04
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;

    public static void main(String[] args)
    {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Don't click here.");

	ActionListener listener = new ClickListener();
	button.addActionListener(listener);
	
	panel.add(button);
	frame.add(panel);

	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
