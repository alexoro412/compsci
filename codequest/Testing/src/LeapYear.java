import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * Created by alexoro on 3/6/16.
 */
public class LeapYear {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/Prob03.in.txt"));
        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int numLines = Integer.parseInt(s.nextLine());
            for(int j = 0;j<numLines;j++){
                int year =  Integer.parseInt(s.nextLine());
                boolean isLeapYear;
                if(year<1582) isLeapYear = false;
                else if(year%4!=0) isLeapYear = false;
                else if(year%100!=0) isLeapYear = true;
                else if(year%400!=0) isLeapYear = false;
                else isLeapYear = true;

                if(isLeapYear) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }

}
