import java.util.*;
public class TypingTutor{

public static void main(String[] args){

Dictionary dict = new Dictionary();

Scanner sin = new Scanner(System.in);
String line = dict.randomWord() + " "
+ dict.randomWord() + " "
+ dict.randomWord() + " "
+ dict.randomWord() + " "
+ dict.randomWord();
System.out.println(line);

long start = System.currentTimeMillis();
String test = sin.nextLine();
long end = System.currentTimeMillis();
System.out.println((end-start)/1000.0);
System.out.println(test.equals(line));
System.out.println(line.length()/5.0/((end-start)/1000.0/60));

}

}
