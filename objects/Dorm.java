import java.util.*;
public class Dorm{

	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
DormRoom a;
System.out.print("Width: ");
double l = s.nextDouble();
s.nextLine();


System.out.print("Length: ");
double w = s.nextDouble();
s.nextLine();

System.out.print("Name: ");
String n = s.nextLine();
if(n.equals("")){
	 a = new DormRoom(l,w);
}else{
	 a = new DormRoom(l,w,n);
}
System.out.println(a.getLength());
System.out.println(a.getWidth());
System.out.println(a.getName());
System.out.println(a.getArea());
System.out.println();
System.out.println(a);
	}

}
