import java.util.ArrayList;
import java.util.Random;
public class PermutationGenerator{

	public static ArrayList<String> generatePermutation(){
		ArrayList<String> p = new ArrayList<String>();
		p.add("A");
		p.add("B");
		p.add("C");
		p.add("D");
		p.add("E");
		p.add("F");
		p.add("G");
		p.add("H");
		p.add("I");
		p.add("J");

		Random r = new Random();

		ArrayList<String> p2 = new ArrayList<String>();
		while(p.size() > 0){
			String l = p.remove(r.nextInt(p.size()));
			p2.add(l);
		}
		return p2;
	}

}
