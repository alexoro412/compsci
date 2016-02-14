public class SubstringMover {

public static void main(String[] args){

String line;
line = "Once upon a time (here we go again), in a land far far away.";
System.out.println(line);
int firstParen = line.indexOf("(");
int secondParen = line.indexOf(")");
String firstPart = line.substring(0,firstParen-1);
String secondPart = line.substring(secondParen+1,line.length()-1);
String paren = line.substring(firstParen-1,secondParen+1);
System.out.println(firstPart + secondPart + paren + ".");

}

}
