package collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args){

        //ArrayList

        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println("ArrayList Elements");
        System.out.println("\t"+ a1);

        // remove second element
        a1.remove(1);

        System.out.println("\n ArrayList Elements");
        System.out.println("\t" + a1);


        //LinkedList

        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println("LinkedList elements");
        System.out.println("\t"+ l1);

        // HashSet

        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");

        System.out.println("Set elements");
        System.out.println("\t"+s1);


        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara","8");
        m1.put("Mahnaz","31");
        m1.put("Ayan","12");
        m1.put("Daisy","14");
        System.out.println();
        System.out.println("Map Elements");
        System.out.println("\t"+ m1);

        //TreeMap

        Map<String, String> tm = new TreeMap<>();
        tm.put("Zara","8");
        tm.put("Mahnaz", "31");
        tm.put("Ayan" , "12");
        tm.put("Daisy","14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t"+ tm);

        // Hash map

        Map<String, String> m2 = new HashMap<>();
        m2.put("Zara","8");
        m2.put("Mahnaz", "31");
        m2.put("Ayan", "12");
        m2.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t"+m2);

        m2.remove("Daisy");
        System.out.println(" Map Elements ");
        System.out.println("\t" + m2);

        // Create a sorted map
        SortedMap<String, Double> map = new TreeMap<>();

        map.put("Zara", Double.valueOf(3434.34));
        map.put("Mahnaz",Double.valueOf(123.22));
        map.put("Ayana",Double.valueOf(1378.00));
        map.put("Daisy", Double.valueOf(99.22));
        map.put("Qadir",Double.valueOf(-19.08));

        Double value = map.get("Qadir");
        System.out.println("Qadir"+value);

        // Put elements to the map

        map.put("Zara",Double.valueOf(3434.34));
        map.put("Mahnaz", Double.valueOf(123.22));
        map.put("Zara",Double.valueOf(1378.00));

        // remove elements from the map

        Double value2 = map.remove("Qadir");
        System.out.println("Qadir removed with value : " + value2);

        // Get a set of the entries
        Set<Map.Entry<String,Double>> set = map.entrySet();

        // Get an iterator

        Iterator<Map.Entry<String,Double>> i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.println(me.getKey());
        }


    }
}
