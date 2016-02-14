import java.util.*;
public class Phone{

public static void main(String[] args){

Scanner sin = new Scanner(System.in);
boolean valid = false;
String phoneNumber = "";
String numbers = "";
while(!valid){
	System.out.print("Please enter your phone number in the form (123)123-1234 : ");
	phoneNumber = sin.nextLine();
	if(phoneNumber.length() == 13){
		if(phoneNumber.charAt(0)=='(' && phoneNumber.charAt(4) == ')' && phoneNumber.charAt(8) == '-'){
			int i = 0;
			char c = ' ';
			while(i<13){
				c = phoneNumber.charAt(i);
				if(c<='9' && c>='0'){
					numbers += c;
				}
				i++;
			}
			if(numbers.length()==10){
				valid=true;
			}
		} 
	}
	if(!valid) System.out.println("Invalid entry.");
}
System.out.println("Thank you for your cooperation");
}

}
