import java.util.ArrayList;
import java.util.Scanner;
public class PermutationGeneratorDriver
{

	public static void main(String[] args)
	{
		Scanner sin = new Scanner(System.in);
		System.out.println("How many permutations would you like to see?");
		int number = sin.nextInt(); sin.nextLine();
		for(int i = 0;i<number;i++){
			System.out.println(PermutationGenerator.generatePermutation());
		}	
	}

}
