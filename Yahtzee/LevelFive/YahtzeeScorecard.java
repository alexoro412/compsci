public class YahtzeeScorecard
{
	/* instance data given */
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int threeKind;
	private int fourKind;
	private int fiveKind;
	private int chance;
	private int fullHouse;
	private int smStraight;
	private int lgStraight;
	private boolean bonus;

	/* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */
	public YahtzeeScorecard()
	{
		/* your code here */
		this.ones = -1;
		this.twos = -1;
		this.threes = -1;
		this.fours = -1;
		this.fives = -1;
		this.sixes = -1;
		this.threeKind = -1;
		this.fourKind = -1;
		this.fiveKind = -1;
		this.chance = -1;
		this.fullHouse = -1;
		this.smStraight = -1;
		this.lgStraight = -1;
		this.bonus = false;
	}

	/* 1. If the field is already full, return false
	   2. Set data value ones equal to number of ones rolled multiplied by one.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markOnes(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.ones >= 0){
			return false;
		}else{
			int score = 0;
			int side = 1;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.ones=score;
			this.updateBonus();
			return true;			
		}
	}

	/* 1. If the field is already full, return false
	   2. Set data value twos equal to number of twos rolled multiplied by two.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markTwos(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.twos >= 0){
			return false;
		}else{
			int score = 0;
			int side = 2;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.twos=score*side;
			this.updateBonus();
			return true;			
		}
	}

	/* 1. If the field is already full, return false
	   2. Set data value threes equal to number of threes rolled multiplied by three.
	   3. Update the bonus (call updateBonus())
	   4. Return true  */
	public boolean markThrees(int die1, int die2, int die3, int die4, int die5)
	{	
		if(this.threes >= 0){
			return false;
		}else{
			int score = 0;
			int side = 3;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.threes=score*side;
			this.updateBonus();
			return true;			
		}
/* your code here */
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fours equal to number of fours rolled multiplied by four.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFours(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.fours >= 0){
			return false;
		}else{
			int score = 0;
			int side = 4;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.fours=score*side;
			this.updateBonus();
			return true;			
		}

		/* your code here */
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fives equal to number of fives rolled multiplied by five.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFives(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.fives >= 0){
			return false;
		}else{
			int score = 0;
			int side = 5;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.fives=score*side;
			this.updateBonus();
			return true;			
		}/* your code here */
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value sixes equal to number of sixes rolled multiplied by six.
	   3. Update the bonus (call updateBonus())
	   4. Returns true */
	public boolean markSixes(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.sixes >= 0){
			return false;
		}else{
			int score = 0;
			int side = 6;
			if(die1 == side) score++;
			if(die2 == side) score++;
			if(die3 == side) score++;
			if(die4 == side) score++;
			if(die5 == side) score++;
			this.sixes=score*side;
			this.updateBonus();
			return true;			
		}/* your code here */
		
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually three of the same value.
		   If there are, set the data value threeKind to the value of all five dice.
		   If there arent set the value to 0.
	   	   (Hint: use YahtzeeSortDice class!)
	   	4. Return true   */
	public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.threeKind >= 0){return false;}
		else{
			YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
			if((sort.getFirst()==sort.getSecond() && sort.getSecond() == sort.getThird()) || (sort.getSecond()==sort.getThird() && sort.getThird()==sort.getFourth()) || (sort.getThird()==sort.getFourth() && sort.getFourth() == sort.getFifth())){
				this.threeKind = die1+die2+die3+die4+die5;
				return true;
			}else{
				this.threeKind = 0;
				return true;
			}
		}
		/* your code here */
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four of the same value.
		   If there are, set the data value fourKind to the value of all five dice.
		   If there arent set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		4. Return true  */
	public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.fourKind >= 0){return false;}
		else{
			YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
			if((sort.getFirst()==sort.getSecond() && sort.getSecond()==sort.getThird() && sort.getThird()==sort.getFourth()) || (sort.getSecond() == sort.getThird() && sort.getThird()==sort.getFourth() && sort.getFourth()==sort.getFifth())){
				this.fourKind = die1+die2+die3+die4+die5;
				return true;
			}else{
				this.fourKind = 0;
				return true;
			}
		}	
		/* your code here */
	}

	/* 1. If the field is already full, return false
	   2. Check to see if there are actually three die with the same value, and two with another value.
	      If there are, set the data value fullHouse to 25.
	      If there arent set the value to 0.
	      (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
	public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.fullHouse >= 0){
			return false;
		}else{
			YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
			if((sort.getFirst() == sort.getSecond() && sort.getSecond() != sort.getThird() && sort.getThird() == sort.getFourth() && sort.getFourth() == sort.getFifth()) || (sort.getFirst() == sort.getSecond() && sort.getSecond() == sort.getThird() && sort.getThird() != sort.getFourth() && sort.getFourth() == sort.getFifth())){
				this.fullHouse = 25;
				return true;
			}else{
				this.fullHouse = 0;
				return true;
			}
		}
		/* your code here */
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four consecutive dice numbers.
		   If there are, set the data value smStraight to 30.
		   If there arent set the value to 0.
		   (Hint: Use YahtzeeSortedDice class)
		4. Return true  */
	public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.smStraight >= 0){
			return false;
		}else{
			YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
			if((sort.getFirst() == (sort.getSecond()-1) && sort.getSecond() == (sort.getThird()-1) && sort.getThird() == (sort.getFourth()-1)) || (sort.getSecond() == (sort.getThird()-1) && sort.getThird() == (sort.getFourth()-1) && sort.getFourth() == (sort.getFifth()-1))){
				this.smStraight = 30;
				return true;
			}else{
				this.smStraight = 0;
				return true;
			}
		}
		/* your code here */
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually five consecutive dice numbers.
		   If there are, set the data value lgStraight to 40.
		   If there arent set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		3. Return true  */
	public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.lgStraight >= 0){
			return false;
		}else{
			YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
			if((sort.getFirst() == (sort.getSecond()-1) && sort.getSecond() == (sort.getThird()-1) && sort.getThird() == (sort.getFourth()-1) && sort.getFourth() == (sort.getFifth()-1))){
				this.lgStraight = 40;
				return true;
			}else{
				this.lgStraight = 0;
				return true;
			}
		}	/* your code here */
	}

	/* 1. If the field is already full, return false
	   2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there arent set the value to 0;
       3. Return true   */
	public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.fiveKind >= 0){
			return false;
		}else{
			if(die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5){
				this.fiveKind = 50;
				return true;
			}else{
				this.fiveKind = 0;
				return true;
			}
		}
		/* your code here */
	}

	/* 1. If the field is already full, return false
	   2. Set the data value chance to the value of all five dice.
	   3. Return true  */
	public boolean markChance(int die1, int die2, int die3, int die4, int die5)
	{
		if(this.chance >= 0){
			return false;
		}else{
			this.chance = die1 + die2 + die3 + die4 + die5;
			return true;
		}
		/* your code here */
	}

	/* 	1. If the bonus has already been assigned, do nothing
		2. If the upper sections total is 63 or greater, set the data value bonus to true */
	private void updateBonus()
	{
		if(bonus){
			//do nothing!
		}else{
			if(this.getUpperTotal() >= 63) bonus = true;
		}
		/* your code here */
	}

	/* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
	public int getUpperTotal()
	{
		int total = 0;
		if(this.ones >= 0) total += this.ones;
		if(this.twos >= 0) total += this.twos;
		if(this.threes >= 0) total += this.threes;
		if(this.fours >= 0) total += this.fours;
		if(this.fives >= 0) total += this.fives;
		if(this.sixes >= 0) total += this.sixes;
		return total;
	}

	/* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
	public int getLowerTotal()
	{

		int total = 0;
		if(this.threeKind >= 0) total += this.threeKind;
		if(this.fourKind >= 0) total += this.fourKind;
		if(this.fiveKind >= 0) total += this.fiveKind;
		if(this.chance >= 0) total += this.chance;
		if(this.fullHouse >= 0) total += this.fullHouse;
		if(this.smStraight >= 0) total += this.smStraight;
		if(this.lgStraight >= 0) total += this.lgStraight;
		return total;
	}

	/* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
	public int getGrandTotal()
	{
		int total = 0;
		total += this.getUpperTotal();
		total += this.getLowerTotal();
		if(this.bonus) total += 35;
		return total;
	}

	/*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
		Sample:
		**********************************
		*  	    Yahtzee Score Card		 *
		*  					`		  	 *
		* 	Ones:				__		 *
		* 	Twos:				__		 *
		* 	Threes:				__		 *
		* 	Fours:				__		 *
		* 	Fives:				25		 *
		* 	Sixes:				__		 *
		*								 *
		*	Upper Bonus:		 0		 *
		* 	Upper Total:   		25		 *
		*								 *
		*	3 of Kind:			__		 *
		* 	4 of Kind:			__		 *
		* 	Full House:			25		 *
		* 	Sm Straight:		__		 *
		* 	Lg  Straight:		__		 *
		* 	Yahtzee:	  		 0		 *
		* 	Chance:				__		 *
		*								 *
		* 	Lower Total:		25		 *
		*								 *
		* 	Grand Total:		50		 *
		**********************************
		already implemented
	*/
	public void printScoreCard()
	{
		System.out.println();
		System.out.println("*********************************");
		System.out.println("*      Yahtzee Score Card       *");
		System.out.println("*                               *");
		System.out.print("*  Ones:\t\t");
		if(ones==-1)System.out.print("__");
		else System.out.print(ones);
		System.out.println("\t*");
		System.out.print("*  Twos:\t\t");
		if(twos==-1)System.out.print("__");
		else System.out.print(twos);
		System.out.println("\t*");
		System.out.print("*  Threes:\t\t");
		if(threes==-1)System.out.print("__");
		else System.out.print(threes);
		System.out.println("\t*");
		System.out.print("*  Fours:\t\t");
		if(fours==-1)System.out.print("__");
		else System.out.print(fours);
		System.out.println("\t*");
		System.out.print("*  Fives:\t\t");
		if(fives==-1)System.out.print("__");
		else System.out.print(fives);
		System.out.println("\t*");
		System.out.print("*  Sixes:\t\t");
		if(sixes==-1)System.out.print("__");
		else System.out.print(sixes);
		System.out.println("\t*");
		System.out.println("*\t\t\t\t*");
		System.out.print("*  Upper Bonus:\t\t");
		if(bonus)System.out.print("35");
		else System.out.print("0");
		System.out.println("\t*");
		System.out.print("*  Upper Total:\t\t");
		System.out.print(this.getUpperTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  3 of Kind:\t\t");
		if(threeKind==-1)System.out.print("__");
		else System.out.print(threeKind);
		System.out.println("\t*");
		System.out.print("*  4 of Kind:\t\t");
		if(fourKind==-1)System.out.print("__");
		else System.out.print(fourKind);
		System.out.println("\t*");
		System.out.print("*  Full House:\t\t");
		if(fullHouse==-1)System.out.print("__");
		else System.out.print(fullHouse);
		System.out.println("\t*");
		System.out.print("*  Sm Straight:\t\t");
		if(smStraight==-1)System.out.print("__");
		else System.out.print(smStraight);
		System.out.println("\t*");
		System.out.print("*  Lg Straight:\t\t");
		if(lgStraight==-1)System.out.print("__");
		else System.out.print(lgStraight);
		System.out.println("\t*");
		System.out.print("*  Yahtzee:\t\t");
		if(fiveKind==-1)System.out.print("__");
		else System.out.print(fiveKind);
		System.out.println("\t*");
		System.out.print("*  Chance:\t\t");
		if(chance==-1)System.out.print("__");
		else System.out.print(chance);
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Lower Total:\t\t");
		System.out.print(this.getLowerTotal());
		System.out.println("\t*");
		System.out.println("*                               *");
		System.out.print("*  Grand Total:\t\t");
		System.out.print(this.getGrandTotal());
		System.out.println("\t*");
		System.out.println("**********************************");
		System.out.println();
	}


}
