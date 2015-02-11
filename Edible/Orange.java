public class Orange implements Edible
{
    public static final String foodGroup = "fruit";
    public double calories;
    public Orange()
    {
	calories = 87;
    }

    public String getFoodGroup()
    {
	return foodGroup;
    }

    public double getCalories()
    {
	return calories;
    }
}
