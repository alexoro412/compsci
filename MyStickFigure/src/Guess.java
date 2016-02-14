import java.util.*;
public class Guess 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Min: ");
		int min = s.nextInt();
		System.out.print("Max: ");
		int max = s.nextInt();
		
		Random gen = new Random();
		System.out.print("Guess: ");
		int guess = s.nextInt();
		int number = gen.nextInt(max-min+1)+min;
		System.out.println((guess == number) + "\nAns: " + number);
		
		
		//System.out.println(gen.nextInt(max+min-1)-(min-2));
		
		
		
		
		
	}
}
