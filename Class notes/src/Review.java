/**
 * Created by alexoro on 11/20/15.
 */
public class Review {
    public static void main(String[] args) {
        String s = "CSA";

        String line = "1CSA2 3CCSASA4";

        int loc;

        loc = line.indexOf(s);

        while(loc!=-1)

        {
            System.out.println(line.substring(loc+s.length()));
            System.out.println(s.length());
            System.out.println(line.charAt(loc));
            line = line.substring(0,loc)+line.substring(loc+s.length());

            loc = line.indexOf(s);

        }

        //System.out.println(line);
    }

}
