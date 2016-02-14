public class polygonDriver{

public static void main(String[] args){

polygon poly = new polygon();
polygon rect = new rectangle();
polygon squa = new square();
polygon octa = new octagon();


System.out.println(poly);
System.out.println(rect);
System.out.println(squa);
System.out.println(octa);

System.out.print("Octagon = polygon: ");
System.out.println(octa.equals(poly));
System.out.print("Rectangle = Square: ");
System.out.println(rect.equals(squa));

}


}
