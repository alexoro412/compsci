import java.util.Random;

public class TreasureHunt
{
	//declare two private instance variables
	//one should be a 2D char array
	//one should be an int to keep track of the number of guesses
	private char[][] tiles;
	private int numGuesses;

	//The constructor should initialize the 2D array to be 3 rows by 5 cols.
	//It should randomly place a 'G' into the 2D array (this will be the gold)
	//Initialize variable that holds the number of guesses
	public TreasureHunt()
	{
		tiles = new char[3][5];
		for(int i = 0;i<tiles.length;i++){
			for(int j = 0;j<tiles[i].length;j++){
				tiles[i][j] = ' ';
			}
		}
		tiles[(int)(Math.random()*3)][(int)(Math.random()*5)] = 'G';
		numGuesses = 0;
		// 0..1 * 3 = 0..3
	}

	//Increments the number of guesses.
	//Places and 'X' in the location if the guess is not correct.
	//Returns true if the row and col passed in is the location of the gold
	//Returns false if the row and col are out of bounds or not the location
	//of the gold.
	public boolean isGold(int row, int col)
	{
		numGuesses++;
		if(row >= 3 || col >= 5) return false;
		if(tiles[row][col] == 'G'){
			return true;
		}else{
			tiles[row][col] = 'X';
			return false;
		}
	}

	//returns the number of guesses
	public int getNumGuesses()
	{
		return numGuesses;
	}

	//Prints the board
	//Code just like from lecture EXCEPT that is does not print the 'G'!!!
	public void printBoard()
	{
		for(int i = 0;i<tiles.length;i++){
			for(int j = 0;j<tiles[i].length;j++){
				if(tiles[i][j] != 'G'){
					System.out.print(tiles[i][j]);
				}else{
					System.out.print(' ');
				}
				if(j < tiles[i].length - 1){
					System.out.print('|');
				}
			}
			if(i<tiles.length-1){
				System.out.println("\n---------");
			}
		}
		System.out.print('\n');
	}
}
