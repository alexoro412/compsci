/**
 * Created by alexoro on 8/31/15.
 */
public class Basketball
{
    public static void main(String[] args)
    {
        double men = 9.39;
        double women = 9.07;
        double hoop = 22.85;

        men *= 2.54;
        women *= 2.54;
        hoop *= 2;

        boolean womensFit = (women * 2) <= hoop;
        boolean mensFit = (men * 2) <= hoop;

        double mensSpace = hoop - (men*2);
        double womensSpace = hoop - (women*2);

        System.out.println(womensFit + "" + mensSpace);
        System.out.println(mensFit + "" + womensSpace);
    }
}
