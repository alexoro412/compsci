//TicTacToeBoard.java
//12/2005
//by Ryan Paulson
//CMD added isEmpty on 1.4.2006

/*This class keeps track of a Tic-Tac-Toe board without
  the use of arrays. */

public class TicTacToeBoard
{
	private char one;
	private char two;
	private char three;
	private char four;
	private char five;
	private char six;
	private char seven;
	private char eight;
	private char nine;

	public TicTacToeBoard()
	{
		one='1';
		two='2';
		three='3';
		four='4';
		five='5';
		six='6';
		seven='7';
		eight='8';
		nine='9';
	}

	public boolean isEmpty(int num)
	{
		switch(num)
		{
			case 1: return one == '1';
			case 2: return two == '2';
			case 3: return three == '3';
			case 4: return four == '4';
			case 5: return five == '5';
			case 6: return six == '6';
			case 7: return seven == '7';
			case 8: return eight == '8';
			case 9: return nine == '9';
		}
		return false;
	}

	public boolean markOne(char c)
	{
		if(one!='1') return false;
		one=c;
		return true;
	}

	public boolean markTwo(char c)
	{
		if(two!='2') return false;
		two=c;
		return true;
	}

	public boolean markThree(char c)
	{
		if(three!='3') return false;
		three=c;
		return true;
	}

	public boolean markFour(char c)
	{
		if(four!='4') return false;
		four=c;
		return true;
	}

	public boolean markFive(char c)
	{
		if(five!='5') return false;
		five=c;
		return true;
	}

	public boolean markSix(char c)
	{
		if(six!='6') return false;
		six=c;
		return true;
	}

	public boolean markSeven(char c)
	{
		if(seven!='7') return false;
		seven=c;
		return true;
	}

	public boolean markEight(char c)
	{
		if(eight!='8') return false;
		eight=c;
		return true;
	}

	public boolean markNine(char c)
	{
		if(nine!='9') return false;
		nine=c;
		return true;
	}

	public void printBoard()
	{
		System.out.println();
		System.out.print(" ");
		if(one=='1') System.out.print("1");
		else System.out.print(one);
		System.out.print(" | ");
		if(two=='2') System.out.print("2");
		else System.out.print(two);
		System.out.print(" | ");
		if(three=='3') System.out.println("3");
		else System.out.println(three);
		System.out.println("----------");
		System.out.print(" ");
		if(four=='4') System.out.print("4");
		else System.out.print(four);
		System.out.print(" | ");
		if(five=='5') System.out.print("5");
		else System.out.print(five);
		System.out.print(" | ");
		if(six=='6') System.out.println("6");
		else System.out.println(six);
		System.out.println("----------");
		System.out.print(" ");
		if(seven=='7') System.out.print("7");
		else System.out.print(seven);
		System.out.print(" | ");
		if(eight=='8') System.out.print("8");
		else System.out.print(eight);
		System.out.print(" | ");
		if(nine=='9') System.out.println("9");
		else System.out.println(nine);
		System.out.println();
	}

	public boolean gameOver()
	{
		if(one==two && two==three) return true;
		if(four==five && five==six) return true;
		if(seven==eight && eight==nine) return true;
		if(one==four && four==seven) return true;
		if(two==five && five==eight) return true;
		if(three==six && six==nine) return true;
		if(one==five && five==nine) return true;
		if(three==five && five==seven) return true;
		return false;
	}

	public boolean isBoardFull()
	{
		if(one!='1' && two!='2' && three!='3' && four!='4' && five!='5' && six!='6'
		   && seven!='7' && eight!='8' && nine!='9') return true;
		return false;
	}
}
