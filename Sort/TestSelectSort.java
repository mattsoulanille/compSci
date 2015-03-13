//import SelectSort;


public class TestSelectSort
{
    public static void main(String[] args)
    {
	//	int[] list = new int[] {1,3,56,8,9,0,6,4,2,54,6,7,8,6,4,4,5,6,7};
	ListGen gen = new ListGen();

	int[] list = gen.getList(30, 9);

	for(int x : list) {
	    System.out.print(x + " ");
	}

	System.out.println();
	SelectSort.sort(list);

	for(int x : list) {
	    System.out.print(x + " ");
	}
	System.out.println();
	
    }
}
    
