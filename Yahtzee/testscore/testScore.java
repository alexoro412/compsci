import java.util.Random;
public class testScore{

	public static void main(String[] args){
		YahtzeeScorecard1 s1;
		YahtzeeScorecard s2;
		Random r = new Random();
		for(int i =0;i<30000;i++){
			s1 = new YahtzeeScorecard1();
			s2 = new YahtzeeScorecard();
			int d1 = r.nextInt(5)+1;
			int d2 = r.nextInt(5)+1;
			int d3 = r.nextInt(5)+1;
			int d4 = r.nextInt(5)+1;
			int d5 = r.nextInt(5)+1;
			System.out.println(d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);
			System.out.println("ones: " + (s1.markOnes(d1,d2,d3,d4,d5) == s2.markOnes(d1,d2,d3,d4,d5)));
			System.out.println("twos: " + (s1.markTwos(d1,d2,d3,d4,d5) == s2.markTwos(d1,d2,d3,d4,d5)));
			System.out.println("threes: " + (s1.markThrees(d1,d2,d3,d4,d5) == s2.markThrees(d1,d2,d3,d4,d5)));
			System.out.println("fours: " + (s1.markFours(d1,d2,d3,d4,d5) == s2.markFours(d1,d2,d3,d4,d5)));
			System.out.println("fives: " + (s1.markFives(d1,d2,d3,d4,d5) == s2.markFives(d1,d2,d3,d4,d5)));
			System.out.println("sixes: " + (s1.markSixes(d1,d2,d3,d4,d5) == s2.markSixes(d1,d2,d3,d4,d5)));
			System.out.println("fullhouse: " + (s1.markFullHouse(d1,d2,d3,d4,d5) == s2.markFullHouse(d1,d2,d3,d4,d5)));
			System.out.println("3 kind: " + (s1.markThreeOfAKind(d1,d2,d3,d4,d5) == s2.markThreeOfAKind(d1,d2,d3,d4,d5)));
			System.out.println("4 kind: " + (s1.markFourOfAKind(d1,d2,d3,d4,d5) == s2.markFourOfAKind(d1,d2,d3,d4,d5)));
			System.out.println("lg straight: " + (s1.markLargeStraight(d1,d2,d3,d4,d5) == s2.markLargeStraight(d1,d2,d3,d4,d5)));
			System.out.println("sm straight: " + (s1.markSmallStraight(d1,d2,d3,d4,d5) == s2.markSmallStraight(d1,d2,d3,d4,d5)));
			System.out.println("yahtzee: " + (s1.markYahtzee(d1,d2,d3,d4,d5) == s2.markYahtzee(d1,d2,d3,d4,d5)));
			System.out.println("chance: " + (s1.markChance(d1,d2,d3,d4,d5) == s2.markChance(d1,d2,d3,d4,d5)));
			System.out.println("-----------------------");
			System.out.println("upper: " + (s1.getUpperTotal() == s2.getUpperTotal()));
			System.out.println("lower: " + (s1.getLowerTotal() == s2.getLowerTotal()));
			System.out.println("total: " + (s1.getGrandTotal() == s2.getGrandTotal()));
			System.out.println("alex: ");
			s1.printScoreCard();
			System.out.println("teacher: ");
			s2.printScoreCard();
		}
	}

}
