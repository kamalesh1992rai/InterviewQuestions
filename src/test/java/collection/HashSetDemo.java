package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args){

        int[] count = {34,22,10,60,30,22};

        Set<Integer> set = new LinkedHashSet<>();
        try {
            for (int i= 0; i< 5; i++){
                set.add(count[i]);
            }
            System.out.println(set);
        }
        catch (Exception e) {}

    }
}
