import java.util.Random;
public class YahtzeeSortDiceTestDriver{
	
	public static void main(String[] args){
		YahtzeeSortDice sort = new YahtzeeSortDice(2,3,4,1,2);
		Random r = new Random();
		for(int i = 0;i<40;i++){
			sort = new YahtzeeSortDice(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
			System.out.println(sort.getFirst() + ", " + sort.getSecond() + ", " + sort.getThird() + ", " + sort.getFourth() + ", " + sort.getFifth());
			System.out.println(sort.getFirst() <= sort.getSecond() && sort.getSecond() <= sort.getThird() && sort.getThird() <= sort.getFourth() && sort.getFourth() <= sort.getFifth());
			System.out.println();
		}
	}

}
