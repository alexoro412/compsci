
//import dictionary.*;

public class CompoundWords
{

public static void main(String[] args)
{

Dictionary dict = new Dictionary();
String word = dict.randomWord().concat("-".concat(dict.randomWord()));

System.out.println(word + " Wow! That word is " + word.length() + " characters long!");


}

}
