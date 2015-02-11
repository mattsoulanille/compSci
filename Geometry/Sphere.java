/**
  * Sphere.java program
  * @author Matthew Soulanille
  * @version 2014-12-18
*/
import java.lang.Math;
public class Sphere
{
    private double r;
    private static final double pi = Math.PI;
    public Sphere(double r)
    {
	this.r = r;
    }
    public double getVolume()
    {
	return 4.0/3.0*pi*r*r*r;
    }
    public double getSurface()
    {
	return 4.0*pi*r*r;
    }
}
