/**
 * The Ball class creates a representation of a "ball" that can move
 * across the screen.
 * @author Richard White 
 * @version 2015-02-08
 */

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball
{
    // instance variables - replace the example below with your own
    public int size;
    private int x;
    private int y;
    private int vX;
    private int vY;
    private int aX;
    private int aY;
    
    /**
     * Constructor for objects of class Ball
     * @param xLoc the initial x location of the upper-left edge of ball
     * @param yLoc the initial y location of "
     * @param velX = the initial x-component of the ball's velocity
     * @param velY = the initial y-component of "
     * @param theSize = the dimensions of the "ball" (a box shape)
     */
    public Ball(int xLoc, int yLoc, int velX, int velY, int theSize)
    {
        // initialise instance variables
        size = theSize;
        x = xLoc;
        y = yLoc;
        vX = velX;
        vY = velY;
	aX = 0;
	aY = 0;

    }

    public Ball(int xLoc, int yLoc, int theSize)
    {
	size = theSize;
        x = xLoc;
        y = yLoc;
	vX = 0;
        vY = 0;
	aX = 0;
	aY = 0;
    }

    /**
     * Identifies the new position of the ball based on previous values
     */
    public int[] getPos()
    {
	return new int[] {x, y};
    }
    public int[] getVel()
    {
	return new int[] {vX, vY};
    }
    public void move()
    {
        x = x + vX;
        y = y + vY;
    }
    public void setvX(int vX)
    {
	this.vX = vX;
    }
    public void setvY(int vY)
    {
	this.vY = vY;
    }
    public void accelerate()
    {
	vX = vX + aX;
	vY = vY + aY;
    }
    
    /**
     * Creates a graphical version of the ball and displays it
     */
    public void drawIt(Graphics2D g2)
    {
        Rectangle ball = new Rectangle(x, y, size, size);
        g2.draw(ball);
    }
}
