/**
 * Created by alexoro on 3/10/16.
 */
public class RecursivePower
{
    public static int powerIterative(int base, int power)
    {
        int result=1;
        for(int i=0; i < power; i++)
        {
            result*=base;
        }
        return result;
    }
    public static int powerRecursive(int base, int power)
    {
        if(power == 1) return base * 1;
        return base * powerRecursive(base, power - 1);
    }
    public static void main(String[] args)
    {
        System.out.println("iterative power : 2 to the 5th power is " +
                powerIterative(2,5));
        System.out.println("recursive power : 2 to the 5th power is " +
                powerRecursive(2,5));
        System.out.println("iterative power : 5 to the 2nd power is " +
                powerIterative(5,2));
        System.out.println("iterative power : 2 to the 0th power is " +
                powerIterative(2,0));
    }
}
