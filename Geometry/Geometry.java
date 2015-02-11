/**
  * Geometry.java program
  * @author Matthew Soulanille
  * @version 2014-12-11
*/

public class Geometry
{
    private static double pi = 3.14159265358979323;

    public static double SphereVolume(double r)
    {
	return 4.0/3.0*pi*r*r*r;
    }
    public static double cylinderSurface(double r, double h)
    {
	return 2*pi*r*h + pi*r*r*2;
    }
    public static double coneVolume(double r, double h)
    {
	return 1/3 * pi * r*r*h;
    }
}

       
    
