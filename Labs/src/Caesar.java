/**
 * Created by alexoro on 9/2/15.
 */
public class Caesar {
    public static void main(String[] args) {
        char a='a',b='b',c='c';
        int n = 14525;
        int asciiVal = 97;
        n=n-((n/26)*26)+26;                   //for negative values of n to be properly handled
        n = n%26;                             //remove all 26s that fit in n, making n less than 26
        a = (char)(((a - asciiVal + n) % 26) + asciiVal); //lower char value to 0 for a, 1 for b, etc...
        b = (char)(((b - asciiVal + n) % 26) + asciiVal); //add displacement value, remove any 26s that fit, make it less than 26
        c = (char)(((c - asciiVal + n) % 26) + asciiVal); //add 97 back, setting chars to proper ASCII values
        System.out.println(a + "" + b + "" + c);
    }
}
