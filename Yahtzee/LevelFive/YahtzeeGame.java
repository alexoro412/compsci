import java.util.Scanner;

public class YahtzeeGame
{
	/* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
	which should be set to six (the number of sides on a yahtzee die) */
	private static final int NUM_SIDES = 6;

	YahtzeeDie die1;
	YahtzeeDie die2;
	YahtzeeDie die3;
	YahtzeeDie die4;
	YahtzeeDie die5;

	YahtzeeScorecard scorecard;

	/* initializes the dice and scoreboard */
	public YahtzeeGame()
	{
	
		die1 = new YahtzeeDie(this.NUM_SIDES);
		die2 = new YahtzeeDie(this.NUM_SIDES);
		die3 = new YahtzeeDie(this.NUM_SIDES);
		die4 = new YahtzeeDie(this.NUM_SIDES);
		die5 = new YahtzeeDie(this.NUM_SIDES);
		scorecard = new YahtzeeScorecard();	
		/* your code here */
	}

	/* check to see if the game is over, and while the game is not over call the method takeTurn()
	once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
	final scorecard and return the grand total */
	public int playGame()
	{
		for(int i=0;i<13;i++){
			this.takeTurn();
		}
		scorecard.printScoreCard();
		/* your code here */
		return scorecard.getGrandTotal();
	}

	/* 	1. call rollDice()
		2. call printDice()
		3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		4. call chooseFrozen()
		5. call rollDice()
		6. call printDice()
		7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		8. call chooseFrozen()
		9. call rollDice()
		10. call printDice()
		11. call markScore()
	*/
	private void takeTurn()
	{
		this.rollDice();
		this.printDice();
		System.out.print("Are you (s)atisfied or to you want to freeze dice and (r)oll again? (s/r): ");
		Scanner s = new Scanner(System.in);
		char choice = s.nextLine().charAt(0);
		if(choice == 'r'){
			this.chooseFrozen();
			this.rollDice();
			this.printDice();
			System.out.print("Are you (s)atisfied or do you want to freeze dice and (r)oll again? (s/r): ");
			choice = s.nextLine().charAt(0);
			if(choice == 'r'){
				this.chooseFrozen();
				this.rollDice();
				this.printDice();
				this.markScore();
			}else{
				this.markScore();
			}
		}else{
			this.markScore();
		}
	}

	/* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
	private void rollDice()
	{
		/* your code here */
			if(!die1.isFrozen()) die1.rollDie();
			if(!die2.isFrozen()) die2.rollDie();
			if(!die3.isFrozen()) die3.rollDie();
			if(!die4.isFrozen()) die4.rollDie();
			if(!die5.isFrozen()) die5.rollDie();
			
			die1.unfreezeDie();
			die2.unfreezeDie();
			die3.unfreezeDie();
			die4.unfreezeDie();
			die5.unfreezeDie();	
	}

	/* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
	private void chooseFrozen()
	{
		/* your code here */
		Scanner s = new Scanner(System.in);
		System.out.print("Which dice would you like to freeze? (1-5): ");
		String choices = s.nextLine();
		for(int i = 0;i<choices.length();i++){
			char num = choices.charAt(i);
			if(num == '1') die1.freezeDie();
			else if(num == '2') die2.freezeDie();
			else if(num == '3') die3.freezeDie();
			else if(num == '4') die4.freezeDie();
			else if(num == '5') die5.freezeDie();	
		}
	}

	/* Should print the value of all five dice separated by a tab (\t) to the console */
	private void printDice()
	{
		/* your code here */
		System.out.println(die1.getValue() + "\t" + die2.getValue() + "\t" + die3.getValue() + "\t" + die4.getValue() + "\t" + die5.getValue());
	}

	/* 1. Print a scoreboard
	   2. Ask the user where they would like to mark their score.
	   3. Call appropriate function
	   4. If false is returned the user entered an invalid number, so ask the user to try again	*/
	private void markScore()
	{
		/* your code here */
		boolean success = false;
		Scanner s = new Scanner(System.in);
		while(!success){
		scorecard.printScoreCard();
System.out.println("1. Ones         7.  3 of Kind");
System.out.println("2. Twos         8.  4 of Kind");
System.out.println("3. Threes       9.  Full House");
System.out.println("4. Fours        10. Sm Straight");
System.out.println("5. Fives        11. Lg Straight");
System.out.println("6. Sixes        12. Yahtzee");
System.out.println("                13. Chance\n");
		System.out.print("Where would you like to mark your score?(1-13): ");
		int choice = s.nextInt();
		s.nextLine();
		/*
1. Ones 	7.  3 of Kind
2. Twos 	8.  4 of Kind
3. Threes 	9.  Full House
4. Fours 	10. Sm Straight
5. Fives 	11. Lg Straight
6. Sixes 	12. Yahtzee
		13. Chance
		*/
//TODO set to return to a boolean
			if(choice == 1) success = scorecard.markOnes(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 2) success = scorecard.markTwos(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 3) success = scorecard.markThrees(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 4) success = scorecard.markFours(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 5) success = scorecard.markFives(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 6) success = scorecard.markSixes(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 7) success = scorecard.markThreeOfAKind(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 8) success = scorecard.markFourOfAKind(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 9) success = scorecard.markFullHouse(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 10) success = scorecard.markSmallStraight(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 11) success = scorecard.markLargeStraight(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 12) success = scorecard.markYahtzee(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());
                else if(choice == 13) success = scorecard.markChance(die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue());

		}
	}
}
