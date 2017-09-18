
public class QuickSort implements SortingAlgorithm{

/////////////////////////////////////////////////////////////////////////////	
	
	public void sort(int[] a) {
		sort(a, 0, a.length-1);
	}

/////////////////////////////////////////////////////////////////////////////	
	
	//Recursively pick new pivots until array is sorted
	public void sort(int[] a, int top, int bot) {
		int pivot = partition(a, top, bot);
		
		if(top<pivot-1) {
			sort(a, top, pivot-1);
		}
		if(pivot < bot) {
			sort(a, pivot, bot);
		}	
	}

/////////////////////////////////////////////////////////////////////////////	
	
	public int partition(int[] a, int top, int bot) {
		int pivot = a[top];
		
		while(top<=bot) {
			while(a[top] < pivot) {
				top++;
			}
			while(a[bot] > pivot) {
				bot--;
			}	
			if(top <= bot) {
				swap(a, top, bot);
				top++;
				bot--;
			}
		}
		return top;
	}

/////////////////////////////////////////////////////////////////////////////	
	
	//Swap two elements
	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
/////////////////////////////////////////////////////////////////////////////	

}
