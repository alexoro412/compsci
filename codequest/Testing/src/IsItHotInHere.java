import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by alexoro on 3/6/16.
 */
public class IsItHotInHere {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("ExampleInputs/Prob04.in.txt"));
        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            int numLines = Integer.parseInt(s.nextLine());
            for(int j = 0;j<numLines;j++){
                float temp = s.nextFloat();
                String type = s.nextLine();
                System.out.print(temp + "" + type + " = ");
//                System.out.println("|"+type+"|");
                float convertedTemp;
                if(type.equals(" F")){
                    convertedTemp = ((5f/9f) * (temp - 32f));
                    convertedTemp = Math.round(convertedTemp*10);
                    System.out.println(convertedTemp/10 + " C");
                    // c = (5/9)(f-32)
                    // (9/5)c = (f-32)
                }else{
//                    System.out.println((5f/9f) * (temp - 32f));
//                    System.out.println((temp+32f) / (9f/5f));
                    convertedTemp = ((9f/5f)*temp + 32f);
                    convertedTemp = Math.round(convertedTemp*10);
                    System.out.println(convertedTemp/10 + " F");
                }
            }
        }
    }

}
