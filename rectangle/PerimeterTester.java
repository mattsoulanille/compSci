/**
PerimeterTester program for AP Comp Sci
@author Matthew Soulanille
@version 2014-09-10
*/

import java.awt.Rectangle;

public class PerimeterTester
{
    public static void main(String[] args)
    {
	Rectangle myRect = new Rectangle(10, 30, 50, 60);
	double perimeter = myRect.getWidth() * 2 + myRect.getHeight() * 2;
	System.out.print("The height is: ");
	System.out.println(myRect.getHeight());
	System.out.print("The width is: ");
	System.out.println(myRect.getWidth());
	System.out.print("The perimeter is: ");
	System.out.println(perimeter);
    }
}
	    
