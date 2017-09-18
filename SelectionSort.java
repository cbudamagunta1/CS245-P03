
public class SelectionSort implements SortingAlgorithm{

/////////////////////////////////////////////////////////////////////////////	
	
	public void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			//Find the smallest element
			int smallest = smallest(a, i);
			//Swap current element for the smallest
			swap(a, smallest, i);
		}
	}

/////////////////////////////////////////////////////////////////////////////	
	
	//Swap two elements
	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
/////////////////////////////////////////////////////////////////////////////	
	
	//Find the smallest element in the unsorted array
	int smallest(int[] a, int start) {
		int smallest = start;
		
		for(int i = start+1; i<a.length; i++) {
			if(a[i]<a[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
	
/////////////////////////////////////////////////////////////////////////////	
	
}
