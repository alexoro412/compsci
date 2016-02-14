public class TestPlayer
{
	public static void main(String[] args)
	{
		TicTacToeBoard b = new TicTacToeBoard();

		HumanPlayer p = new HumanPlayer();

		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
		b.printBoard();
		p.takeTurn(b);
	}
}
