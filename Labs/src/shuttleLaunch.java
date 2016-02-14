/**
 * Created by alexoro on 9/1/15.
 */
import java.util.*;
public class shuttleLaunch {
    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        double curTemp = 99;
        double cloudCover = 0.48;
        boolean isRaining = false;
        int timeSinceLastLightning = 50;
        double windSpeed = 34;
        boolean overrideIsOn = false;

        curTemp = sin.nextDouble();
        cloudCover = sin.nextDouble();
        isRaining = sin.nextBoolean();
        timeSinceLastLightning = sin.nextInt();
        windSpeed = sin.nextInt();
        overrideIsOn = sin.nextBoolean();

        if(overrideIsOn || ((curTemp < 100 && curTemp > 32) && ((cloudCover <= 0.48 && !isRaining) || (cloudCover <= 0.25 && isRaining)) && timeSinceLastLightning >= 45 && windSpeed <= 34 )) {
            //override         temperature                                                rain/clouds                                                    lightning              wind
            System.out.println("You can launch");
        }else{

            System.out.println("You can't even");
        }

        }
}
