import java.util.PriorityQueue;

/**
 * Created by alexoro on 3/4/16.
 */
public class PriorityQueueTestBed {

    public static void main(String[] args) {
        PriorityQueue<String> sorted = new PriorityQueue<String>();

        sorted.add("Zebra");
        sorted.add("Afghan");
        sorted.add("Phone");
        sorted.add("0");

        System.out.println(sorted);

        System.out.println(sorted.peek());

        System.out.println(sorted);
        System.out.println(sorted.poll());
//        System.out.println(sorted);
    }


}
