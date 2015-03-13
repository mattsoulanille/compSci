import java.lang.Math;

public class ListGen
{

    public ListGen()
    {

    }

    public int[] getList(int length, int range)
    {
	int[] list = new int[length];

	for(int x = 0; x < length; x ++) {
	    list[x] = (int) Math.floor((range+1) * Math.random());
	}
	return list;
    }
}


		
    
