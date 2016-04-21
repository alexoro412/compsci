import java.util.Scanner;               //Make the Scanner class available
import java.util.ArrayList;				//Make the ArrayList class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available

public class FindCity
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<CityZip> list = new ArrayList<CityZip>();
		Scanner inFile = new Scanner(new File("OH_zips.txt"));

		while(inFile.hasNextLine())
		{
			int zip = inFile.nextInt();
			String city = inFile.nextLine();
			city = city.substring(2); //eat two leading spaces
			list.add(new CityZip(city,zip));
		}

		System.out.println("Expected output:");
		System.out.println("ALEXANDRIA, COLUMBUS, city not found, LEWISTOWN, CINCINNATI");
		System.out.println("ALEXANDRIA, COLUMBUS, city not found, LEWISTOWN, CINCINNATI");

		System.out.println();
		System.out.println("Actual output:");
		System.out.print(findCitySequential(list,43001)+", ");
		System.out.print(findCitySequential(list,43230)+", ");
		System.out.print(findCitySequential(list,43999)+", ");
		System.out.print(findCitySequential(list,43333)+", ");
		System.out.println(findCitySequential(list,45999));

		System.out.print(findCityBinary(list,43001)+", ");
		System.out.print(findCityBinary(list,43230)+", ");
		System.out.print(findCityBinary(list,43999)+", ");
		System.out.print(findCityBinary(list,43333)+", ");
		System.out.println(findCityBinary(list,45999));

	}

	// postcondition:  returns city with give zip, or "city not found"
	// use a SQUENTIAL search!
	public static String findCitySequential(ArrayList<CityZip> list, int zip)
	{
		for(int i = 0;i<list.size();i++){
			if(list.get(i).getZip() == zip) return list.get(i).getCity();
		}
		//your code here
		return "city not found";
	}


	// pre condition:  list must be sorted
	// postcondition:  returns city with give zip, or "city not found"
	// use a BINARY search!
	public static String findCityBinary(ArrayList<CityZip> list, int zip)
	{
		//your code here
		int mid;
		int high = list.size()-1;
		int low = 0;
		while(low<=high){
			mid = (high + low)/2;
			if(list.get(mid).getZip() == zip) return list.get(mid).getCity();
			else if(list.get(mid).getZip() < zip) low = mid + 1;
			else high = mid - 1;
		}
		return "city not found";
	}

}
