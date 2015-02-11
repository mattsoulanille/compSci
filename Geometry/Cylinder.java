/**
  * Cylinder.java program
  * @author Matthew Soulanille
  * @version 2014-12-18
*/
import java.lang.Math;
public class Cylinder
{
    private static final double pi = Math.PI;
    private double h;
    private double r;

    public Cylinder(double r, double h)
    {
	this.r = r;
	this.h = h;
    }

    public double getVolume()
    {
	return pi*r*r*h;
    }

    public double getSurface()
    {
	return 2*pi*r*h + pi*r*r*2;
    }
}
