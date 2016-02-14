/*When provided with two players, this class can play a game
  of Tic-Tac-Toe*/

public class TicTacToeGame
{
	private TicTacToeBoard board;
	Player p1, p2;

	public TicTacToeGame(Player p1, Player p2)
	{
		//Add code here to initialize the instance data
		this.p1 = p1;
		this.p2 = p2;
		board = new TicTacToeBoard();
	}

	public void playGame()
	{
		board.printBoard();

		//Add code here to play a game.
		//Player 1 gets to go first and then keep alternating
		//turns until either the game is over or the board become
		//full.
		char winState = '0';
		while(!board.gameOver() || !board.isBoardFull()){
			p1.takeTurn(board);
			if(board.gameOver()){
				//p1 won
				winState = '1';
				break;
			}else if(board.isBoardFull()){
				//cats game
				winState = '3';
				break;
			}
			p2.takeTurn(board);
			if(board.gameOver()){
				//p2 won
				winState = '2';
				break;
			}
			if(board.isBoardFull()){
				//cats game
				winState = '3';
				break;
			}
			board.printBoard();
	
		}
		//Display a final message of who won or if it was a cats game.
		if(winState == '1'){
			System.out.println(p1.getName() + " Won");
		}else if(winState == '2'){
			System.out.println(p2.getName() + " Won");
		}else{
			System.out.println("CATS GAME!!!!!!!");
		}
	}
}
