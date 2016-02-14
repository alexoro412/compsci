import java.util.Scanner;

public class YahtzeeDriver
{
	/*
	1. Creates a new instance of the YahtzeeGame class
	2. Calls the playGame method on the Yahtzee object
	3. Asks user if they would like to play again
	4. When the user is done playing, prints the number of games played, min, max, and average score
	*/
	public static void main(String [] args)
	{
			int score;
			YahtzeeGame myGame=new YahtzeeGame();
			System.out.println("Welcome to oro's APCSA Yahtzee Game!");
			Scanner s = new Scanner(System.in);
			char choice = 'y';
			int totalGames = 0;
			int minScore = -1;
			int maxScore = 0;
			int totalScore = 0;
			do{
			score=myGame.playGame();
			totalScore += score;
			totalGames++;
			if(totalGames == 1){
				minScore = score;
				maxScore = score;
			}
			if(score < minScore) minScore = score;
			if(score > maxScore) maxScore = score;

			System.out.println("Would you like to play again?(y/n)");
			choice = s.nextLine().charAt(0);
			myGame = new YahtzeeGame();
			}while(choice == 'y');
			double averageScore = (double)(totalScore) / (double)(totalGames);
			System.out.println("Games played: " + totalGames);
			System.out.println("Min score   : " + minScore);
			System.out.println("Max score   : " + maxScore);
			System.out.println("Avg. score  : " + averageScore);
	}
}
