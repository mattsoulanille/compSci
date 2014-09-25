/**
  * Employee.java program
  * @author Matthew Soulanille
  * @version 2014-09-24
*/

public class Employee
{
    public String name;
    private double salary;
    /*
    public Employee(String newName)
    {
	this.Employee(newName, 0);
    }
    */
    public Employee(String newName, double newSalary)
    {
        name = newName;
	salary = newSalary;

    }
    
    public String getName()
    {
	return name;
    }
    public double getSalary()
    {
	return salary;
    }
    public void raiseSalary(double percent)
    {
	salary = salary * (percent / 100 + 1);
    }
}
