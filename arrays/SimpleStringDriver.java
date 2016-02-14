public class SimpleStringDriver
{
	public static void main(String[] args)
	{
		SimpleString s1 = new SimpleString(new char[]{'a', 'b', 'c'});
		SimpleString s2 = new SimpleString(new char[]{'d', 'e', 'f', 'g'});
		SimpleString s3 = new SimpleString(s1);
		SimpleString s4 = new SimpleString(s2);

		System.out.println("Length should be 3");
		System.out.println("Length is " + s1.length());
		System.out.println();

		System.out.println("Length should be 4");
		System.out.println("Length is " + s2.length());
		System.out.println();

		System.out.println("Length should be 3");
		System.out.println("Length is " + s3.length());
		System.out.println();

		System.out.println("Length should be 4");
		System.out.println("Length is " + s4.length());
		System.out.println();

		System.out.println ("Correct: a b c");
		System.out.print("Actual:  ");
		for(int i=0; i<s1.length();i++)
		System.out.print(s1.charAt(i) + " ");
		System.out.println();

		System.out.println ("Correct: d e f g");
		System.out.print("Actual:  ");
		for(int i=0; i<s2.length();i++)
		System.out.print(s2.charAt(i) + " ");
		System.out.println();

		System.out.println ("Correct: a b c");
		System.out.print("Actual:  ");
		for(int i=0; i<s3.length();i++)
		System.out.print(s3.charAt(i) + " ");
		System.out.println();

		System.out.println ("Correct: d e f g");
		System.out.print("Actual:  ");
		for(int i=0; i<s4.length();i++)
		System.out.print(s4.charAt(i) + " ");
		System.out.println();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);


	}
}
