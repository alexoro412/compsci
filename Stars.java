import java.util.*;

public class Stars{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Rows: ");
int rows = (new Scanner(System.in)).nextInt();
System.out.print("Character: ");
String character = (new Scanner(System.in)).nextLine();
	for(int i = 0;i<=rows;i++){
		for(int j = 0;j<i;j++){
			System.out.print(character + " ");
		}
		System.out.println();
	}

}
}
