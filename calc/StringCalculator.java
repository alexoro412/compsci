import java.util.*;

public class StringCalculator{
public static void main(String[] args){

Scanner sin = new Scanner(System.in);
String problem = sin.nextLine();
if(problem.length() == 5){
int num1 = (int)(problem.charAt(0))-48;
char oper = problem.charAt(2);
int num2 = (int)(problem.charAt(4))-48;
int result = -1;
if(num1 >= 2 || num1 < 0 || num2 >= 2 || num1 < 0){
System.out.println("You dun messed up");
}else{
if(oper == '+'){
result = num1 + num2;
}else if(oper == '-'){
result = num1 - num2;
}else if(oper == '/'){
if(num2 != 0){result = num1 / num2;}else{System.out.println("You dun messed up");}
}else if(oper == '*'){
result = num1 * num2;
}
System.out.println(problem + " = " + result);
}

}else{System.out.println("You dun messed up");}
//System.out.println(problem + " = " + (num1 + num2));

}
}
