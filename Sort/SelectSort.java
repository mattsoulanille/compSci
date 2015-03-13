public class SelectSort
{
    // public static SelectSort()
    // {

    // }

    public static void sort(int[] toSort)
    {
	for(int i = 0; i < toSort.length; i++) {
	    swap(toSort, i, findSmallest(toSort, i));
	}
    }
    
    public static int findSmallest(int[] list, int start)
    {
	int smallest = start;
	for(int i = start; i < list.length; i ++) {
	    if (list[i] < list[smallest]) {
		smallest = i;
	    }
	}
	return smallest;
    }

    public static void swap(int[] list, int a, int b)
    {
	int tmp = list[a];
	list[a] = list[b];
	list[b] = tmp;
    }
}
