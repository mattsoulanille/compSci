/**
  * Car.java program
  * @author Matthew Soulanille
  * @version 2014-09-24
*/

public class Car
{
    public double efficiency; // distance per fuel
    public double gas;

    public Car(double newEfficiency)
    {
	assert efficiency > 0 : "Must have positive efficiency";
	efficiency = newEfficiency;
	gas = 0.0;
    }
    
    public void addGas(double gasToAdd)
    {
	assert gas >= 0 : "Can't add negative gas.";
	gas += gasToAdd;
    }

    public void drive(double km)
    {
	assert gas >= gas - km * 1/efficiency : "Can't drive that far!";
	gas = gas - km * 1/efficiency;
    }
    
    public double getGasInTank()
    {
	return gas;
    }

}
