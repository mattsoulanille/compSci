/**
  * EmployeeTester.java program
  * @author Matthew Soulanille
  * @version 2014-09-24
*/

public class EmployeeTester
{
    public static void main(String args[])
    {
	Employee ralph = new Employee("Ralph", 1000);
	System.out.println("Name = " + ralph.getName() + "\tExpected Ralph");
	System.out.println("Salary = " + ralph.getSalary() + "\tExpected 1000");
	System.out.println("Ralph gets a raise of 40%");
	ralph.raiseSalary(40);
	System.out.println("New Salary = " + ralph.getSalary() + "\tExpected 1400");
    }
}
	    
