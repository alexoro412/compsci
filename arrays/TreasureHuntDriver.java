import java.util.Scanner;

public class TreasureHuntDriver
{
	public static void main(String[] args)
	{

		System.out.println("Treasure Hunt!");
		System.out.println("Guess where the gold is!");

		TreasureHunt t = new TreasureHunt();
		Scanner s = new Scanner(System.in);
		int row,col;
		boolean found = false;

		do
		{
			t.printBoard();

			System.out.println("Please enter your guess of where the gold is.");
			System.out.print("Row (0-2): ");
			row = s.nextInt();
			System.out.print("Col (0-4): ");
			col = s.nextInt();
			s.nextLine();

			found = t.isGold(row,col);
			if(found)
			{
				System.out.println("You found the gold in just " + t.getNumGuesses() + " tries");
			}
			else
			{
				System.out.println("Better keep looking . . .");
			}
		} while (!found);
	}
}
