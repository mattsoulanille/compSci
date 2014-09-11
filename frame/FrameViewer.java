/**
  * FrameViewer.java program
  * @author Richard White
  * @version 2014-09-11
*/

import javax.swing.JFrame;
public class FrameViewer
{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();  // constructing a Frame
        myFrame.setSize(800,600);       // (pixels across, pixels down)
        myFrame.setTitle("My Frame, Eh?");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // We'll construct something to be viewed here in a minute
	//	RectangleComponent myBox = new RectangleComponent();
	EllipseComponent myEllipse = new EllipseComponent();
    
        // We'll add the thing that we've constructed to the frame here
	//        myFrame.add(myBox);
	myFrame.add(myEllipse);
    
        // Now we need to show the frame
        myFrame.setVisible(true);
    }
}
