import java.util.*;

public class ClockDriver{
public static void main(String[] args){

Scanner sin = new Scanner(System.in);

System.out.println("12 hour or 24 hour time?");

int choice = sin.nextInt();

if(choice == 12){
	
	Clock c = new Clock(00,00,00,"AM");
	Clock c2 = new Clock(14,27,26,"PM");
	System.out.println(c2.getTime());
	System.out.println(c.getTime());
}else{
	Clock c = new MilitaryClock(00,00,00);
	Clock c2 = new MilitaryClock(14,27,26);
	System.out.println(c2.getTime());
	System.out.println(c.getTime());
	

}

}
}
