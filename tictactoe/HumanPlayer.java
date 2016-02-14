import java.util.*;
public class HumanPlayer extends Player{

	public HumanPlayer(){

		System.out.println("What is your name? ");
		Scanner sin = new Scanner(System.in);

		this.setName(sin.nextLine());

		super.numPlayers++;
		char ch;
		if (numPlayers == 1) ch = 'X';
		else ch = 'O';
		System.out.println(this.getName() + ", you will be " + ch + "'s");
		this.setChar(ch);

	}

	public int getMove(TicTacToeBoard board)
	{
		Scanner sin = new Scanner(System.in);
		boolean foundMove = false;


		int move = 0;
		while (!foundMove)
		{
			System.out.print(getName() + ", please choose a spot to place your mark (1-9): ");
			move = sin.nextInt(); //an alternate to the Random class
			if(move > 0 && move < 10)
			foundMove = board.isEmpty(move);
		}

		//System.out.println(move);
		return move;
	}

}
