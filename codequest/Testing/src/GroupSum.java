/**
 * Created by alexoro on 3/10/16.
 */
public class GroupSum {

    public static boolean groupSum(int start, int[] a, int target) {
        if(start >= a.length) return target == 0;
        return groupSum(start + 1, a, target) || groupSum(start + 1, a, target-a[start]);
    }

    public static boolean groupSum6(int start, int[] a, int target){
        if(start >= a.length) return target == 0;
        if(a[start] == 6){
            return groupSum6(start + 1, a, target-a[start]);
        }
        return groupSum6(start + 1, a, target) || groupSum6(start + 1, a, target-a[start]);
    }

    public static void main(String[] args) {
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));
        System.out.println(groupSum6(0, new int[]{6, 4, 6}, 10));
    }
}
