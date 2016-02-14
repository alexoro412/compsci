import java.util.*;
import java.awt.*;

public class MonteCarlo{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.print("Number of trials: ");
    long trials = sin.nextLong();
    Random r = new Random();
    int i = 0;
    double pointsInsideCircle = 0.0;
    double totalPoints = 0.0;
    Point centerPoint = new Point(250,250);
    while(i<trials){
      Point currentPoint = new Point(r.nextInt(500),r.nextInt(500));
      totalPoints++;
      if(centerPoint.distance(currentPoint)<=250) pointsInsideCircle++;
      i++;
    }
    double pi = (pointsInsideCircle/totalPoints)*4.0;
    System.out.println("Calculated value: " + pi);
    double percentDiff = ((Math.abs(pi-Math.PI))/Math.PI) * 100;
    System.out.println("Percent Difference: " + percentDiff);
  }
}
