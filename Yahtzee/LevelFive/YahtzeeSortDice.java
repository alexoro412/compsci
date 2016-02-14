public class YahtzeeSortDice
{
	int first;
	int second;
	int third;
	int fourth;
	int fifth;

	/* constructor: initializes the private data by sorting the order of the dice */
	public YahtzeeSortDice(int a, int b, int c, int d, int e)
	{
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		
		if(a == 1) ones++;
		if(b == 1) ones++;
		if(c == 1) ones++;
		if(d == 1) ones++;
		if(e == 1) ones++;
	
		if(a == 2) twos++;
		if(b == 2) twos++;
		if(c == 2) twos++;
		if(d == 2) twos++;
		if(e == 2) twos++;

		if(a == 3) threes++;
		if(b == 3) threes++;
		if(c == 3) threes++;
		if(d == 3) threes++;
		if(e == 3) threes++;

		if(a == 4) fours++;
		if(b == 4) fours++;
		if(c == 4) fours++;
		if(d == 4) fours++;
		if(e == 4) fours++;

		if(a == 5) fives++;
		if(b == 5) fives++;
		if(c == 5) fives++;
		if(d == 5) fives++;
		if(e == 5) fives++;

		if(a == 6) sixes++;
		if(b == 6) sixes++;
		if(c == 6) sixes++;
		if(d == 6) sixes++;
		if(e == 6) sixes++;

		if(ones > 0 && this.first == 0){first = 1; ones--;}
		if(ones > 0 && this.second == 0){second = 1; ones--;}
		if(ones > 0 && this.third == 0){third = 1; ones--;}
		if(ones > 0 && this.fourth == 0){fourth = 1; ones--;}
		if(ones > 0 && this.fifth == 0){fifth = 1; ones--;}

		if(twos > 0 && this.first == 0){first = 2; twos--;}
		if(twos > 0 && this.second == 0){second = 2; twos--;}
		if(twos > 0 && this.third == 0){third = 2; twos--;}
		if(twos > 0 && this.fourth == 0){fourth = 2; twos--;}
		if(twos > 0 && this.fifth == 0){fifth = 2; twos--;}

		if(threes > 0 && this.first == 0){first = 3; threes--;}
		if(threes > 0 && this.second == 0){second = 3; threes--;}
		if(threes > 0 && this.third == 0){third = 3; threes--;}
		if(threes > 0 && this.fourth == 0){fourth = 3; threes--;}
		if(threes > 0 && this.fifth == 0){fifth = 3; threes--;}

		if(fours > 0 && this.first == 0){first = 4; fours--;}
		if(fours > 0 && this.second == 0){second = 4; fours--;}
		if(fours > 0 && this.third == 0){third = 4; fours--;}
		if(fours > 0 && this.fourth == 0){fourth = 4; fours--;}
		if(fours > 0 && this.fifth == 0){fifth = 4; fours--;}

		if(fives > 0 && this.first == 0){first = 5; fives--;}
		if(fives > 0 && this.second == 0){second = 5; fives--;}
		if(fives > 0 && this.third == 0){third = 5; fives--;}
		if(fives > 0 && this.fourth == 0){fourth = 5; fives--;}
		if(fives > 0 && this.fifth == 0){fifth = 5; fives--;}

		if(sixes > 0 && this.first == 0){first = 6; sixes--;}
		if(sixes > 0 && this.second == 0){second = 6; sixes--;}
		if(sixes > 0 && this.third == 0){third = 6; sixes--;}
		if(sixes > 0 && this.fourth == 0){fourth = 6; sixes--;}
		if(sixes > 0 && this.fifth == 0){fifth = 6; sixes--;}
}

	/* returns the minimum of the five numbers */
	public int getFirst()
	{
		//your code here
		return this.first;
	}

	/* returns the second smallest of the five number */
	public int getSecond()
	{
		//your code here
		return this.second;
	}

	/* returns the middle of the five numbers */
	public int getThird()
	{
		//your code here
		return this.third;
	}

	/* returns the second largest of the five numbers */
	public int getFourth()
	{
		//your code here
		return this.fourth;
	}

	/* returns the biggest of the five numbers */
	public int getFifth()
	{
		//your code here
		return this.fifth;
	}
}
