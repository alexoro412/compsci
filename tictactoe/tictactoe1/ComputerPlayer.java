// ComputerPlayer.java
// 1.3.2006
// by Mr. Daubenmier

/* This class extends Player to create a computer player.
   The computer is "dumb" in the sense that the strategy
   the is has is to pick a random spot on the board in
   getMove(). */

public class ComputerPlayer extends Player
{
	public ComputerPlayer()
	{

		System.out.print("Please enter your name: ");

		System.out.println("Dumb Computer");
		String name = "Dumb Computer";

		super.numPlayers++;
		char ch;
		if (numPlayers == 1) ch = 'X';
		else ch = 'O';

		System.out.println(name + ", you will be " + ch + "\'s.");

		super.setChar(ch);
		super.setName(name);
	}

	public int getMove(TicTacToeBoard board)
	{
		boolean foundMove = false;

		System.out.print(getName() + ", please choose a spot to place your mark (1-9): ");

		int move = 0;
		while (!foundMove)
		{
			move = (int)(Math.random()*9) + 1; //an alternate to the Random class
			foundMove = board.isEmpty(move);
		}

		System.out.println(move);
		return move;
	}
}
