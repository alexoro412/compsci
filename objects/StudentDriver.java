import java.util.*;
public class StudentDriver{

	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		System.out.print("first name: ");
		String name = sin.nextLine();
		System.out.print("last name: ");
		String lastname = sin.nextLine();
		System.out.print("gender: ");
		String gender = sin.nextLine();
		System.out.print("SSN: ");
		String ssn = sin.nextLine();
		Student s2 = new Student(name,lastname,gender.charAt(0),ssn);


		System.out.print("first name: ");
		name = sin.nextLine();
		System.out.print("last name: ");
		lastname = sin.nextLine();
		System.out.print("gender: ");
		gender = sin.nextLine();
		System.out.print("SSN: ");
		ssn = sin.nextLine();
		Student s1 = new Student(name,lastname,gender.charAt(0),ssn);

		System.out.println(s1.equals(s2));
	}
}
