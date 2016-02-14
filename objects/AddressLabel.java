import java.util.*;

public class AddressLabel{
public static void main(String[] args){

Scanner sin = new Scanner(System.in);
System.out.print("Delimiter: ");
String delim = sin.nextLine().substring(0,1);
System.out.println("Enter an address with lines separated by " + delim);

String s = sin.nextLine();
int len = s.length();
StringTokenizer st = new StringTokenizer(s,delim);

for(int i = 0; i<len;i++){
System.out.print("*");
}
System.out.println();

while(st.hasMoreTokens()){
System.out.print("* ");
String s1 = st.nextToken();
System.out.print(s1);
for(int i = s1.length(); i<len-3; i++){
	System.out.print(" ");
}
System.out.println("*");
}
for(int i =0; i<len;i++){
System.out.print("*");
}
System.out.println();
}
}
