/**
 * Created by alexoro on 3/14/16.
 */
public class Unit11Review {
    public static int fac1(int n)
    {
        if (n==0) return 1;
        else return n * fac1(n-1);
    }
    public static int fac2(int cur, int n){
        if(cur == n) return n;
        else if(cur==0) return fac2(cur+1,n);
        else return cur*fac2(cur+1, n);
    }

    public static void main(String[] args) {
        System.out.println(fac1(0));
        System.out.println(fac2(0, 0));
    }
}
