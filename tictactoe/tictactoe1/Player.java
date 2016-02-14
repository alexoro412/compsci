// Player.java
// 1.3.2006
// by Mr. Daubenmier

/* This abtract class provides some default behavior for
   a Tic-Tac-Toe player, but getMove() is abstract so it
   can be defined as the subclass sees fit.
*/

public abstract class Player
{
	public static int numPlayers = 0;
	private char c;
	private String name;

	public void takeTurn(TicTacToeBoard board)
	{
		int move = getMove(board);
		//notice that getMove can be called even though it is abstract

		recordMove(move, board);
	}

	// should return a valid move between 1 and 9
	public abstract int getMove(TicTacToeBoard board);

	public void setChar(char c)
	{
		this.c = c;
	}

	public String getName()
	{
		return name;
	}

	public char getChar()
	{
		return c;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//marks the board with the appropriate character
	private void recordMove(int move, TicTacToeBoard board)
	{
		if(move==1) board.markOne(c);
		if(move==2) board.markTwo(c);
		if(move==3) board.markThree(c);
		if(move==4) board.markFour(c);
		if(move==5) board.markFive(c);
		if(move==6) board.markSix(c);
		if(move==7) board.markSeven(c);
		if(move==8) board.markEight(c);
		if(move==9) board.markNine(c);
	}
}

