import java.util.*;
public class Temp{
public static void main(String[] args){
Scanner sin = new Scanner(System.in);

System.out.println("Yo. F or C: ");
String kind = sin.nextLine();

System.out.println("Temp: ");
int temp = sin.nextInt();
sin.nextLine();
int ftemp;

if(kind.equals("c")){
ftemp =(int)((9.0/5.0) * temp + 32);
System.out.println(temp + " celsius is " + ftemp + " fahrenheit");
}else{
int ctemp =(int)((5.0/9.0) * (temp - 32));
System.out.println(temp + " fahrenheit is " + ctemp + " celsius");
ftemp = temp;
}

if(ftemp>=85){
System.out.print("swim");}
else if(ftemp<85 && ftemp >=70){
System.out.print("tennis");}
else if(ftemp<70 && ftemp >= 32){
System.out.print("golf");}
else if(ftemp<32 && ftemp >= 0){
System.out.print("ski");}
else{
System.out.print("dance");
}
System.out.println("");
}
}
