package collection;

import java.util.*;

public class MapDemo {

    public static void main(String[] args){
        // Create a hash map

        SortedMap<String, Double> map = new TreeMap<>();

        // Put elements to the map
        map.put("Zara", Double.valueOf(3434.34));
        map.put("Mahnaz",Double.valueOf(123.22));
        map.put("Ayan",Double.valueOf(1378.00));
        map.put("Daisy", Double.valueOf(99.22));
        map.put("Qadir", Double.valueOf(-19.08));

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = map.entrySet();

        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
//        while (i.hasNext()) {
//            Map.Entry<String, Double> me = i.next();
//            System.out.println(me.getKey() + " : " + me.getValue());
//
//        }

        // Display elements
//        while (i.hasNext()){
//            Map.Entry<String, Double> me = i.next();
//            me.setValue(me.getValue()* 10);
//            System.out.println(me.getKey() + " :");
//            System.out.println(me.getValue());
//        }

        // Display elements
        while (i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.println(me.getKey());
        }

    }
}
