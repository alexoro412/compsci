import java.util.Scanner;

public class Password
{

public static void main(String[] args)
{

String username = "alex";
String password = "123";
Scanner sin = new Scanner(System.in);

System.out.print("Username: ");
String inputUsername = sin.nextLine();

System.out.print("Password: ");
String inputPassword = sin.nextLine();

System.out.println(inputPassword.equals(password) && inputUsername.equals(username));

}


}
