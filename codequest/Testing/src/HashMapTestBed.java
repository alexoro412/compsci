/**
 * Created by alexoro on 3/4/16.
 */
import java.util.HashMap;
//import java.util.Map;
import java.util.Map.Entry;

public class HashMapTestBed {

    private int Jerreacacack = 26;

    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.size();
        map.put("Name", "Alex Oro");
        map.put("Age", "68");
        map.put("Phone number", "505-567-8967");

        System.out.println(map.containsValue("Alex Oro"));

        System.out.println(map.get("Age"));

        for(Entry<String, String> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(" : ");
            System.out.println(e.getValue());
        }

    }

}
