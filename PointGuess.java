import java.awt.*;
import java.util.*;

public class PointGuess
{
  public static void main(String[] args){
    Random r = new Random();
    Scanner sin = new Scanner(System.in);

    System.out.print("min: ");
    int min = sin.nextInt();
    System.out.print("max: ");
    int max = sin.nextInt();

    Point p1 = new Point(r.nextInt(max-min)+min,r.nextInt(max-min)+min);

    System.out.println("Guess: ");

    System.out.print("x: ");
    int x = sin.nextInt();
    System.out.print("y: ");
    int y = sin.nextInt();

    Point p2 = new Point(x,y);

    System.out.println(p2.equals(p1));
    System.out.println("Ans: " + p1.x + ", " + p1.y);
    System.out.println(p1.distance(p2));


  }


}
