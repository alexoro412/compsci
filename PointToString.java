import java.awt.*;
import java.util.*;
public class PointToString{

public static void main(String[] args){

Random r = new Random();
Point p1 = new Point(r.nextInt(),r.nextInt());
Point p2 = new Point(r.nextInt(),r.nextInt());

String s1 = p1.toString();
String s2 = p2.toString();

System.out.println(s1);
System.out.println(s2);

String s1x = s1.substring(s1.indexOf("x=")+2,s1.indexOf(","));
String s1y = s1.substring(s1.indexOf("y=")+2,s1.indexOf("]"));

String s2x = s2.substring(s2.indexOf("x=")+2,s2.indexOf(","));
String s2y = s2.substring(s2.indexOf("y=")+2,s2.indexOf("]"));

System.out.println("(" + s1x + ", " + s1y + ")");
System.out.println("(" + s2x + ", " + s2y + ")");
Point origin = new Point(0,0);
double distA = origin.distance(p1);
double distB = origin.distance(p2);
System.out.println("Point A is farther than point B from the origin: " + (distA > distB));
System.out.println("Point B is farther than point A from the origin: " + (distB > distA));


}

}
