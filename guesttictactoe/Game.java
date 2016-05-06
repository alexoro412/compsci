import java.util.Scanner;

public class Game{

	private String[][] board;

	static String X = "X";
	static String O = "O";

	public Game(){
		board = new String[3][3];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = " ";
			}
		}
	}

	public void printBoard(){

		for(int i = 0; i < board.length; i++){
			if(i > 0) System.out.println("-----");
			else System.out.println();
			for(int j = 0; j < board.length; j++){
				if(j > 0) System.out.print("|");
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

		/*
		for(String[] row : board){
			for(String item : row){
				if(item == null){
					System.out.print(" ");
				}else{
					System.out.print(item);
				}
			}
			System.out.println();
		}
		*/
	}

	public boolean checkWinner(String play){
		// check horizontal
		int inRow = 0;
		for(String[] row : board){
			for(String item : row){
				if(play.equals(item) ){
					inRow++;
				}else{
					break;
				}
			}
			if(inRow == 3){
				return true;
			}
			inRow = 0;
		}

		int colCount[] = new int[3];

		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if(board[i][j] != null && board[i][j].equals(play)){
					colCount[j]++;
				}
			}
		}

		for(int c : colCount){
			if(c == 3) return true;
		}

		if(
			(board[0][0].equals(play) // left to right diagonal
			&& board[1][1].equals(play)
			&& board[2][2].equals(play))
			||
			(board[2][0].equals(play) // right to left diagonal
			&& board[1][1].equals(play)
			&& board[0][2].equals(play))){
				return true;
		}
		return false;

	}

	public void makeMove(Scanner stdin, String play){
		int row = 0;
		int col = 0;
		boolean goodInput = false;
		boolean error = false;
		while(!goodInput){
			if(stdin.hasNextInt())
				row = stdin.nextInt();
			else
				error = true;


			if(stdin.hasNextInt())
				col = stdin.nextInt();
			else
				error = true;

			if(error){
				System.out.println("Invalid input...");
				stdin.nextLine();
				continue;
			}
			stdin.nextLine();

			if(row < 0 || row > 2 || col < 0 || col > 2){
				// out of bounds
				System.out.println("Out of bounds...");
				continue;
			}

			if(!board[row][col].equals(" ")){
				System.out.println("Space already occupied");
				continue;
			}

			board[row][col] = play;
			break;
		}
	}

	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		Game g = new Game();
		boolean playing = true;
		while(playing){
			System.out.println("\n\nPlayer 1: (X)");
			g.makeMove(sin, X);
			System.out.println();
			g.printBoard();
			playing = !g.checkWinner(X);
			if(!playing){
				System.out.println("PLAYER 1 WON!");
				break;
			}
			System.out.println("\n\nPlayer 2: (O)");
			g.makeMove(sin, O);
			System.out.println();
			g.printBoard();
			playing = !g.checkWinner(O);
			if(!playing){
				System.out.println("PLAYER 2 WON!");
				break;
			}
		}
	}
}
