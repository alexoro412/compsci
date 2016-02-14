import java.util.*;
public class Type{

public static void main(String[] args){

Scanner sin = new Scanner(System.in);
String word = sin.nextLine();
char letter = word.charAt(0);

if(letter >= 'a' && letter <= 'z'){
	System.out.println("Letter");
	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
		System.out.println("Vowel");
	}	

}else if(letter >= '0' && letter <= '9'){
	System.out.println("number");
}else{

	switch(letter)
	{
	case '!': case '@': case '#': case '$': case '%': case '^': case '&': case '*': System.out.println("symbol"); break;
	default: System.out.println("unknown");

}

}


}

}
