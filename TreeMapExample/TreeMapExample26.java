package TreeMapExample;
import java.util.Map;
import java.util.TreeMap;

/*
 * Example of firstEntry() method.
 */
public class TreeMapExample26
{
    public static void main( String[] args )
    {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(10, "Cat");
        treeMap.put(50, "Dog");
        treeMap.put(30, "Apple");
        treeMap.put(40, "Ball");
        treeMap.put(20, "Eagle");

        System.out.println("treeMap : " + treeMap + "\n");

        /*
         * Returns a key-value mapping associated with the least key in this
         * map, or null if the map is empty.
         */
        Map.Entry<Integer, String> entry = treeMap.firstEntry();

        System.out.println("firstEntry : " + entry);

        System.out.println("key : " + entry.getKey() + "," + "Value : "
                + entry.getValue() + "\n");

        
        /*
         * Returns a key-value mapping associated with the greatest key in this
         * map, or null if the map is empty.
         */
        entry = treeMap.lastEntry();

        System.out.println("lastEntry : " + entry);

        System.out.println("key : " + entry.getKey() + "," + "Value : "
                + entry.getValue() + "\n");
    }
}