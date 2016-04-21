public class SelectionSortDriver
{
	public static void main(String[] args)
	{
		Comparable[] planets={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		Comparable[] sortedPlanets=Sorts.selectionSort(planets);

		for(int i=0; i<planets.length; i++)
		{
			System.out.println(planets[i]+" ");
		}
		System.out.println("---");
		for(int i=0; i<sortedPlanets.length; i++)
		{
			System.out.println(sortedPlanets[i]+" ");
		}
	}
}
