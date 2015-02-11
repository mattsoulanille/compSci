/**
  * FrameViewer.java program
  * @author Richard White
  * @version 2014-09-11
*/

import javax.swing.JFrame;
import java.awt.FlowLayout;
public class FrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();  // constructing a Frame
	//	frame.setLayout(new FlowLayout());
	
	int x = 800;
	int y = 600;
        frame.setSize(x,y);       // (pixels across, pixels down)
        frame.setTitle("My Frame, Eh?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // We'll construct something to be viewed here in a minute
	//	RectangleComponent myBox = new RectangleComponent();
	//	EllipseComponent myEllipse = new EllipseComponent();
	RainbowComponent rainbow = new RainbowComponent();
	//	TextComponent text = new TextComponent();
        // We'll add the thing that we've constructed to the frame here
	//	frame.add(text);
	frame.add(rainbow);
	//	frame.add(myBox);

	//frame.add(myEllipse);
    
        // Now we need to show the frame
        frame.setVisible(true);
    }
}
