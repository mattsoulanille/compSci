/**
  * Student.java program
  * @author Matthew Soulanille
  * @version 2014-09-25
*/

public class Student
{
    public String name;
    private double gradeSum;
    private int quizCount;
    public Student(String newName)
    {
	name = newName;
	gradeSum = 0;
	quizCount = 0;
    }
    
    public String getName()
    {
	return name;
    }
    
    public void addQuiz(int score)
    {
	gradeSum += score;
	quizCount += 1;
    }

    public double getTotalScore()
    {
	return gradeSum;
    }

    public double getAverageScore()
    {
	return this.getTotalScore() / quizCount;

    }
}
