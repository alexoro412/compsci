import java.util.*;
public class Checker{
public static void main(String[] args){

Scanner sin = new Scanner(System.in);

System.out.print("Enter string to encrypt: ");
String msg = sin.nextLine();
String encoded = EncryptionHelper.encode(msg);
System.out.println(encoded);

char char1 = msg.charAt(0);
char char2 = msg.charAt(1);
char char3 = msg.charAt(2);
char char4 = msg.charAt(3);
char char5 = msg.charAt(4);


char echar1 = (char)((int)(Math.pow(/*(int)(char1-(int)('a'))*/char1, 1) % 26) + (int)('a'));
System.out.println("Character 1: " + (echar1==encoded.charAt(0)));
char echar2 = (char)((int)(Math.pow(/*(int)(char2-(int)('a'))*/char2, 2) % 26) + (int)('a'));
System.out.println("Character 2: " + (echar2==encoded.charAt(1)));
char echar3 = (char)((int)(Math.pow(/*(int)(char3-(int)('a'))*/char3, 3) % 26) + (int)('a'));
System.out.println("Character 3: " + (echar3==encoded.charAt(2)));
char echar4 = (char)((int)(Math.pow(/*(int)(char4-(int)('a'))*/char4, 4) % 26) + (int)('a'));
System.out.println("Character 4: " + (echar4==encoded.charAt(3)));
char echar5 = (char)((int)(Math.pow(/*(int)(char5-(int)('a'))*/char5, 5) % 26) + (int)('a'));
System.out.println("Character 5: " + (echar5==encoded.charAt(4)));
//String custom = echar1 + echar2 + echar3 + echar4 + echar5;
//System.out.println(custom);

}
}
