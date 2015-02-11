/**
 * The BallComponent is used to display a ball on screen
 * @author Richard White    
 * @version 2015-02-08
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BallComponent extends JComponent
{
    Ball aBall;
    static int WIDTH;
    static int HEIGHT;
 

    /**
     * Establishes the component that will display the ball
     * @param xLoc the initial x location of the upper-left edge of ball
     * @param yLoc the initial y location of "
     * @param velX = the initial x-component of the ball's velocity
     * @param velY = the initial y-component of "
     * @param theSize = the dimensions of the "ball" (a box shape)
     */
    public BallComponent(int xLoc, int yLoc, int theVx, int theVy, int theSize, int width, int height)
    {
	WIDTH = width;
	HEIGHT = height;
	aBall = new Ball(xLoc, yLoc, theVx, theVy, theSize);
    }

    public static void resizeCoords(int x, int y)
    {
	WIDTH = x;
	HEIGHT = y;
    }
    
    /**
     * The paintComponent method produces the actual drawing on-screen. Recall
     * that paintComponent receives an object of type Graphics, which is somewhat
     * primitive. The Graphics2D class extends graphics, so we'll cast g to g2 and
     * use that package to create our drawings.
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        aBall.drawIt(g2);          // create initial drawing of ball on component
    }
    
    /**
     * The move method updates the position of the ball, and calls the repaint()
     * method to update the screen
     */
    public void move()
    {
        aBall.move();
	//	aBall.accelerate();
	int[] pos = aBall.getPos();
	int[] vel = aBall.getVel();
	if (pos[0] + aBall.size >= WIDTH && vel[0] > 1) {
	    aBall.setvX(-1*vel[0]);
	}
	if (pos[1] + aBall.size + 20 >= HEIGHT && vel[1] > 1) {
	    aBall.setvY(-1*vel[1]);
	}
	if (pos[0] < 0 && vel[0] < 0) {
	    aBall.setvX(-1*vel[0]);
	}
	if (pos[1] < 0 && vel[1] < 0) {
	    aBall.setvY(-1*vel[1]);
	}
        repaint();
	//	System.out.println(WIDTH + "  " + HEIGHT);
    }
}
