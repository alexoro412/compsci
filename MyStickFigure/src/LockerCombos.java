import java.util.*;

public class LockerCombos {
	public static void main(String[] args){
		Random gen = new Random();
		
		int a1 = gen.nextInt(49);
		int a2 = gen.nextInt(10);
		int a3 = gen.nextInt(49);
		
		int b1 = gen.nextInt(49);
		int b2 = gen.nextInt(10)+10;
		int b3 = gen.nextInt(49);
		
		int c1 = gen.nextInt(49);
		int c2 = gen.nextInt(10)+20;
		int c3 = gen.nextInt(49);
		
		int d1 = gen.nextInt(49);
		int d2 = gen.nextInt(10)+30;
		int d3 = gen.nextInt(49);
		
		int e1 = gen.nextInt(49);
		int e2 = gen.nextInt(10)+40;
		int e3 = gen.nextInt(49);
		
		System.out.println("A:" + a1 + "-" + a2 + "-" + a3 + " B:" + b1 + "-" + b2 + "-" + b3 + "C:" + c1 + "-" + c2 + "-" + c3 + " D:" + d1 + "-" + d2 + "-" + d3 + " E:" + e1 + "-" + e2 + "-" + e3);
		
	}
}
