import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;

/**
 * Created by alexoro on 3/6/16.
 */
public class GrainsOfSand {

    public static void main(String[] args) throws FileNotFoundException{
//        BigInteger
        Scanner s = new Scanner(new File("ExampleInputs/Prob02.in.txt"));

        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int numLines = Integer.parseInt(s.nextLine());
            BigInteger sum = new BigInteger("0");
            for(int j = 0;j<numLines;j++){
//                BigIn
                sum = sum.add(new BigInteger(s.nextLine()));
            }
            System.out.println(sum);
        }
    }

}
