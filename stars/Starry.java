import java.util.*;
public class Starry{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		System.out.print("Width: ");
		int rows = sin.nextInt();
		//rows -= 0;
		// rows = (rows/2)*2;
		rows = (rows)/2+1;
		sin.nextLine();
		System.out.print("Character: ");
		String ch = sin.nextLine();
		for(int i = 0; i<rows;i++){
			for(int j = rows;j>Math.abs(i);j--){
				System.out.print(" ");
			}
			for(int j = 0;j<2*i-1;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i = rows; i>=0;i--){
			for(int j = rows;j>Math.abs(i);j--){
				System.out.print(" ");
			}
			for(int j = 0;j<2*(i)-1;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
