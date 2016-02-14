/*This class is the main
  driver class that allows the user to determine who will
  be playing and then it will allow the user to play as
  many games as he/she likes.*/

import java.util.*;
public class TicTacToe
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		TicTacToeGame game;
		boolean again;
		Player p1, p2;
		String choice;


		//determine who the players will be
		System.out.println("Welcome to Tic Tac Toe!\n\n");
		do{
			System.out.println("Who would you like to play against?");
			System.out.println("1.  The Computer");
			System.out.println("2.  Another Player");
			System.out.print("Please enter your choice: ");
			choice = input.nextLine();
		} while (choice.charAt(0)!='1' && choice.charAt(0)!='2');

		//Create the players
		//Add code here to initialize p1 and p2 to the appropriate values

		p1 = new HumanPlayer();

		if(choice.charAt(0)=='1'){
			p2 = new ComputerPlayer();
		}else{
			p2 = new HumanPlayer();
		}


		//play the game
		do{
			game=new TicTacToeGame(p1, p2);
			game.playGame();
			System.out.print("Would you like to play again? (y/n) ");
			String quit=input.nextLine().toLowerCase();
			if(quit.length()==0) quit="y";
			if(quit.charAt(0)=='n') again=false;
			else again=true;
		}while(again);
	}
}
