public class Breakfast
{
    public static Edible myFruit = new Orange();

    public static void main(String[] args)
    {
	System.out.println(myFruit.getFoodGroup());
    }
}
