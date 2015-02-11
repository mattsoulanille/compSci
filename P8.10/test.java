import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int a = Input.readInt(in, "Number between 3 and 6", "Wrong", 3, 6);
	System.out.println(a);
    }
}
