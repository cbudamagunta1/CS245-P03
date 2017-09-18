
public class MergeSort implements SortingAlgorithm{

/////////////////////////////////////////////////////////////////////////////	
	
	public void sort(int[] a) {
		if (a.length > 1) {

			//Make top array
			int size1 = a.length / 2;
			int[] top = new int[size1];
			for (int i = 0; i < size1; i++) {
				top[i] = a[i];
			}

			//Make bottom array
			int size2 = a.length - size1;
			int[] bot = new int[size2];
			for (int i = 0; i < size2; i++) {
				bot[i] = a[i + size1];
			}

			sort(top);
			sort(bot);
			merge(a, top, bot);
		}
	}

/////////////////////////////////////////////////////////////////////////////	
	
	public void merge(int[] a, int[] top, int[] bot) {
		int topIndex = 0;
		int botIndex = 0;
		int aIndex = 0;

		while(topIndex<top.length && botIndex<bot.length) {
			//If the top array's element is smaller
			if(top[topIndex] <= bot[botIndex]) {
				a[aIndex++] = top[topIndex++];
			//If the bottom array's element is smaller
			}else {
				a[aIndex++] = bot[botIndex++];
			}
		}

		//If the bottom array is out of elements
		while(topIndex<top.length) {
			a[aIndex++] = top[topIndex++];
		}

		//If the top array is out of elements
		while(botIndex < bot.length) {
			a[aIndex++] = bot[botIndex++];
		}
	}
	
/////////////////////////////////////////////////////////////////////////////	
	
}
