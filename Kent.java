import java.util.*;
public class Kent{
public static void main(String[] args){

Scanner sin = new Scanner(System.in);
String phrase = sin.nextLine();
int index = phrase.indexOf("Kent");
boolean there = index != -1;
System.out.println(there);
}

}
