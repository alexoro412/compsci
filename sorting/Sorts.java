public class Sorts{
	public static boolean isSorted(Comparable[] c){
		for(int i = 1; i < c.length; i++){
			if(c[i-1].compareTo(c[i]) < 0) return false;
		}
		return true;
	}

	public static Comparable[] selectionSort(Comparable[] c){
		Comparable[] c2 = c.clone();
		for(int j = 0; j < c2.length; j++){
			Comparable min = c2[j];
			int minIndex = j;
			for(int i = j; i < c2.length - 1; i++){
				if(c2[i].compareTo(min)<0){
					min = c2[i];
					minIndex = i;
				}
			}
			Comparable z = c2[j];
			c2[j] = min;
			c2[minIndex] = z;
		}
		return c2;
	}

	public static Comparable[] insertionSort(Comparable[] c){
		Comparable[] c2 = c.clone();
		for(int i = 0; i < c2.length; i++){
			for(int j = i; j > 0; j--){
				if(c2[j].compareTo(c2[j-1])<0){
					Comparable z = c2[j];
					c2[j] = c2[j-1];
					c2[j-1] = z;
				}else{
					break;
				}
			}
		}
		return c2;
	}
/*
	public static Comparable[] merge(Comparable[] a, Comparable[] b){
		int i = 0;
		int j = 0;
		int k = 0;
		boolean merging = true;
		Comparable[] c = new Comparable[b.length + a.length];
		while(merging){
			if(a[i] < b[j]){
				c[k] = a[i];
				i++;
			}else{
				c[k] = b[j];
				j++;
			}
			if(i >= a.length){
				for(; j < b.length; j++){
					c[k] = b[j];
					k++;
				}
			}

			if(j >= b.length){
				for(; i < a.length; i++){
					c[k] = a[i];
					k++;
				}
			}
		}
		return c;
	}

	public static Comparable[] mergeSort(Comparable[] old){
		Comparable[] c = old.clone();
		mergeSortParts(c,0,c.length-1);
		return c;
	}

	public static void mergeSortParts(Comparable[] c, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			mergeSortParts(c, start, mid);
			mergeSortParts(c, mid + 1, end);
			//merge(c, start, mid, end);
		}
	}
*/
	public static void main(String[] args){
		Comparable[] l = {"B", "AB", "A", "C", "AAA", "AA"};
		Comparable[] l2 = insertionSort(l);
		for(int i = 0; i< l2.length;i++){
			System.out.println(l2[i]);
		}
	}

}
