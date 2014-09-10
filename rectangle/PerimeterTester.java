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
	System.out.println("The height is: " + myRect.getHeight() + '\n' + 
	"The width is: " + myRect.getWidth());
	System.out.println("The perimeter is: " + perimeter);
	System.out.println("The expected answer is: " + 220.0);
	//	System.out.println(perimeter);
    }
}
	    
