/**
 * Created by alexoro on 3/7/16.
 */

import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.util.Scanner;
import java.io.File;

public class CarrierLanding {

    public class AirCraft{
        public String name;
        public Point location;
        public Point landingStart;
        public Point landingEnd;

        public AirCraft(String name, Point location, Point landingStart, Point landingEnd) {
            this.name = name;
            this.location = location;
            this.landingStart = landingStart;
            this.landingEnd = landingEnd;
        }

        public float getSlope(Point a, Point b){
            float dy = a.y - b.y;
            float dx = a.x - b.x;
            return dy/dx;
        }

        public float getStartSlope(){
            return getSlope(location,landingStart);
        }

        public float getEndSlope(){
            return getSlope(location,landingEnd);
        }

        public boolean verifySlopes(){
            boolean start = false;
            boolean end = false;
//            System.out.println(this.name);
//            System.out.println(this.getEndSlope());
//            System.out.println(this.getStartSlope());
            if(getEndSlope() <= -.8f && getEndSlope() >= -1.6f){
                end = true;
            }
//            System.out.println("--\n"+ (getStartSlope() <= -.8) + "\n" + (getStartSlope()>=-1.6f) + "\n--");
            if(getStartSlope() <= -.8f && getStartSlope() >= -1.6f){
                start = true;
            }
//            System.out.println(end + " " + start);
            return start && end;
        }
    }

    private static Point parsePoint(String s){
        String[] l = s.split(",");
        return new Point(Integer.parseInt(l[0]), Integer.parseInt(l[1]));
    }

    public static void main(String[] args) throws FileNotFoundException{
        CarrierLanding c = new CarrierLanding();
        c.start(args);
    }
    public void start(String[] args) throws FileNotFoundException{
//        System.out.println(-1.6>=-1.6);
        Scanner s = new Scanner(new File("JudgingInputs/Prob08.in.txt"));
        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int numPlanes = Integer.parseInt(s.nextLine());
            for (int j = 0; j < numPlanes; j++) {
                String name = s.nextLine();
                String curPos = s.nextLine();
                String staPos = s.nextLine();
                String endPos = s.nextLine();
                Point c = parsePoint(curPos);
                Point sp = parsePoint(staPos);
                Point e = parsePoint(endPos);
                AirCraft a = new AirCraft(name,c,sp,e);
                if(a.verifySlopes()){
                    System.out.println(a.name + ", Clear To Land!");
                }else{
                    System.out.println(a.name+ ", Abort Landing!");
                }
            }
        }
    }

}
