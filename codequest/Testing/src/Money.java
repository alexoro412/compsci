import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by alexoro on 3/6/16.
 */
public class Money {

    public class DataPiece implements Comparable{
        public int year;
        public float gdp;

        public DataPiece(int y, float g){
            this.year = y;
            this.gdp = Math.round(g/1000);
//            this.gdp =
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof DataPiece){
                DataPiece o2 = (DataPiece)(o);
                if(o2.year<this.year) return 1;
                else if(o2.year>this.year) return -1;
            }
            return -1;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Money m = new Money();
        m.start(args);
    }

    public void start(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("JudgingInputs/Prob05.in.txt"));

        int cases = Integer.parseInt(s.nextLine());
        for(int i = 0;i<cases;i++){
            String regionName = s.nextLine();
            int numLines = Integer.parseInt(s.nextLine());
            PriorityQueue<DataPiece> data = new PriorityQueue<DataPiece>();
            for(int j = 0;j<numLines;j++){
                float income = s.nextFloat();
                int year = s.nextInt();
                s.nextLine();

                data.add(new DataPiece(year,income));
            }
            System.out.println(regionName + ":");
            int s2 = data.size();
            for(int j = 0;j<s2;j++){
                DataPiece thing = data.poll();
                System.out.print(thing.year + " ");
                for(int k = 0;k<thing.gdp;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
