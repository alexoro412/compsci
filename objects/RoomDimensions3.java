import java.util.Scanner;
public class RoomDimensions3{

	public static void main(String[] args){
		/*
		System.out.println("--------------------------");
		System.out.println("1. Set Width");
		System.out.println("2. Set Length");
		System.out.println("3. Set Proportional Width");
		System.out.println("4. Set Proportional Length");
		System.out.println("5. Print Room Dimensions");
		System.out.println("6. Quit");
		System.out.println("--------------------------");
		*/
		DormRoom3 d = new DormRoom3();
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while(choice < 7 && choice > 0){	
		System.out.println("--------------------------");
		System.out.println("1. Set Width");
		System.out.println("2. Set Length");
		System.out.println("3. Set Proportional Width");
		System.out.println("4. Set Proportional Length");
		System.out.println("5. Print Room Dimensions");
		System.out.println("6. Print Max Occupancy");
		System.out.println("7. Quit");
		System.out.println("--------------------------");
			choice = s.nextInt();
			if (choice == 1){
				System.out.print("Enter a width: ");
				d.setWidth(s.nextDouble());
			}else if(choice == 2){
				System.out.print("Enter a length: ");
				d.setLength(s.nextDouble());
			}else if(choice == 3){
				System.out.print("Enter a width (Area will be held constant): ");
				d.setProportionalWidth(s.nextDouble());
			}else if(choice == 4){
				System.out.print("Enter a width (Area will be held constant): ");
				d.setProportionalLength(s.nextDouble()); 
			}else if(choice == 5){
				System.out.println("Room dimensions: width=" + d.getWidth() + " length=" + d.getLength() + " Area=" + d.getArea());
			}else if(choice == 6){
				System.out.println("Max occupancy: " + d.getMaxOccupancy());
			}




		}
	}

}
