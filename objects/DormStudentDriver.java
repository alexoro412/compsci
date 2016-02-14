import java.util.*;
public class DormStudentDriver{
//public Student(String firstName, String lastName, char gender, String SSN
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("width:");
	double width = s.nextDouble();
	s.nextLine();
	System.out.println("length:");
	double length = s.nextDouble();
	s.nextLine();
	System.out.println("name:");
	String name = s.nextLine();
	int i;
	DormRoom4 d = new DormRoom4(width,length,name);
	do{
		System.out.println("Options:");
		System.out.println(" 1. Add Student");
		System.out.println(" 2. Switch Student");
		System.out.println(" 3. Remove Student");
		System.out.println(" 4. Is Student in room");
		System.out.println(" 5. Print Students");
		System.out.println(" 6. Quit ");
		i = s.nextInt();
		s.nextLine();
		if(i == 1){
			System.out.println("first name:");
			String firstName = s.nextLine();
			System.out.println("last name:");
			String lastName = s.nextLine();
			System.out.println("gender (m/f):");
			char gender = s.nextLine().charAt(0);
			System.out.println("SSN:");
			String ssn = s.nextLine();
			Student temp = new Student(firstName, lastName, gender, ssn);
			boolean added = d.assignNewStudent(temp);
			System.out.println(added);
		}else if(i==2){
			System.out.println("student to remove:");
			System.out.println("first name:");
			String firstName = s.nextLine();
			System.out.println("last name:");
			String lastName = s.nextLine();
			System.out.println("gender (m/f):");
			char gender = s.nextLine().charAt(0);
			System.out.println("SSN:");
			String ssn = s.nextLine();
			Student temp = new Student(firstName, lastName, gender, ssn);
			//boolean added = d.assignNewStudent(temp);
			//System.out.println(added);
			System.out.println("Student to add:");
			System.out.println("first name:");
			 firstName = s.nextLine();
			System.out.println("last name:");
			 lastName = s.nextLine();
			System.out.println("gender (m/f):");
			 gender = s.nextLine().charAt(0);
			System.out.println("SSN:");
			 ssn = s.nextLine();
			Student temp2 = new Student(firstName, lastName, gender, ssn);
			boolean added = d.switchStudent(temp,temp2);
			System.out.println(added);

		}else if(i==3){
			System.out.println("student to remove:");
			System.out.println("first name:");
			String firstName = s.nextLine();
			System.out.println("last name:");
			String lastName = s.nextLine();
			System.out.println("gender (m/f):");
			char gender = s.nextLine().charAt(0);
			System.out.println("SSN:");
			String ssn = s.nextLine();
			Student temp = new Student(firstName, lastName, gender, ssn);
			boolean removed = d.removeStudent(temp);
			System.out.println(removed);
		}else if(i==4){
			System.out.println("first name:");
			String firstName = s.nextLine();
			System.out.println("last name:");
			String lastName = s.nextLine();
			System.out.println("gender (m/f):");
			char gender = s.nextLine().charAt(0);
			System.out.println("SSN:");
			String ssn = s.nextLine();
			Student temp = new Student(firstName, lastName, gender, ssn);
			System.out.println(d.isStudent(temp));

		}else if(i==5){
			d.printStudents();	
		}
	}while(i<6 && i>0);
	
}

}
