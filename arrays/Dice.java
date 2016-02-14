import java.util.Random;
import java.util.Scanner;
public class Dice{

public static void main(String[] args){

int[] data = new int[12];
//0,1,2,3 4,5,6,7 8,9,10,11
//0 == 0 ? a:b
Scanner sin = new Scanner(System.in);
System.out.println("How many times would you like to roll the dice? ");
int numRolls = sin.nextInt();
sin.nextLine();
Random r = new Random();
for(int i = 0;i<numRolls;i++){
	int r1 = r.nextInt(6); // 0 - 5 -> +1 = 1-6
	int r2 = r.nextInt(6); // r1+r2 = 0 - 10
			       // r1 + r2 + 2 = 2-12
	data[r1+r2]++;
}
int total = 0;
for(int i : data){
total += i;
}
System.out.println("Which number would you like to know the results of? (2-12)");
System.out.println("any other number to quit");
int choice = sin.nextInt();
sin.nextLine();
while(choice >= 2 && choice <= 12){

System.out.println(choice + " : " + ((double)(data[choice-2])/(double)(total))*100 + "%" );
choice = sin.nextInt();
sin.nextLine();
}

}

}
