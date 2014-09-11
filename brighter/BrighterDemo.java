/**
 * BrighterDemo
 * @author Matthew Soulanille
 * @version 2014-09-10
 */

import java.awt.Color;

public class BrighterDemo
{
    public static void main(String[] args)
    {
	Color prettyColor = new Color(50, 100, 150);
	System.out.println("Origional Color: " + prettyColor);
	prettyColor = prettyColor.brighter();
	System.out.println("Brightened Color: " + prettyColor);
    }
}
	    
