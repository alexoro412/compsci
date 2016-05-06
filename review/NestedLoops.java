public class NestedLoops{

	public static void main(String[] args){
		for(int m = 1; m <= 5; m++){
			for(int n = 1; n <= 5; n++){
				if(n!=m) System.out.print(".");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
}
