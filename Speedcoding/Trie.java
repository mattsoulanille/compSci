
import java.util.Random;
public class Trie
{
    private Random generator;

    public Trie()
    {
	generator = new Random();
    }
    public int roll()
    {
	return generator.nextInt(3) + 1;

    }

}
	
