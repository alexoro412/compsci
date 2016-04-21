import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by alexoro on 3/4/16.
 */
public class Monogram {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/Prob01.in.txt"));
//        while(s.hasNextLine()){
//
//        }
        int cases = Integer.parseInt(s.nextLine());
        for(int j = 0;j<cases;j++) {
            int numLines = Integer.parseInt(s.nextLine());
            for (int i = 0; i < numLines; i++) {
                System.out.println(genMonogram(s.nextLine()));
            }
        }
    }

    private static String genMonogram(String line){
        String[] names = line.split(" ");
        return (names[0].substring(0,1) + names[2].substring(0,1) + names[1].substring(0,1)).toUpperCase();
    }
}
