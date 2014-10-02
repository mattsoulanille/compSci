/**
  * StudentTester.java program
  * @author Matthew Soulanille
  * @version 2014-09-25
*/



public class StudentTester
{

    public static void main(String args[])
    {
	Student aaron = new Student("Aaron");
	assert aaron.getName() == "Aaron" : "Student name error";
	aaron.addQuiz(5);
	assert aaron.getTotalScore() == 5 : "Total score error";
	aaron.addQuiz(10);
	assert aaron.getAverageScore() == 7.5 : "Average score error";
	System.out.println("Success, unless you didn't run with the -ea flag");
    }
}
