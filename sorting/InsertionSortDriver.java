public class InsertionSortDriver
{
	public static void main(String[] args)
	{
		Comparable[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Comparable[] sortedMonths=Sorts.insertionSort(months);

		for(int i=0; i<months.length; i++)
		{
			System.out.println(months[i]+" ");
		}
		
		System.out.println();		

		for(int i=0; i<sortedMonths.length; i++)
		{
			System.out.println(sortedMonths[i]+" ");
		}
	}
}

