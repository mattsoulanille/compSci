public class InsertionSort
{
    
    public static void sort(int[] toSort)
    {
	boolean sorted = false;
	while (!sorted) {
	    sorted = true;
	    for(int i = 0; i < toSort.length - 1; i++) {
		if(toSort[i] > toSort[i+1]) {
		    sorted = false;
		    placeValue(toSort, i+1);
		}
	    }
	}
    }
    public static void placeValue(int[] toSort, int itemIndex)
    {
	int toPlace = toSort[itemIndex];
	for(int i = itemIndex - 1; i >= 0; i--) {
	    if(toSort[i+1] > toPlace && toSort[i] < toPlace) {
		toSort[i+1] = toPlace;
	    }
	    else if(toSort[i] > toPlace) {
		toSort[i + 1] = toSort[i];
	    }
	    else if(toSort[i] > toPlace && i == 0) {
		toSort[i + 1] = toSort[i];
		toSort[i] = toPlace;
	    }
	}
    }
}

    
