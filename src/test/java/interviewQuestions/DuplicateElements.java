package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args){
        String[] names={"Java", "JavaScript", "Ruby", "C", "Python", "Java","Python"};

        //1 compare each element
        for (int i=0; i<names.length; i++){
            for (int j= i+1 ; j<names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("duplicate element is : "+ names[i]);
                }
            }
        }

        //2 using Hashset: Java collection: it stores unique values;
        Set<String> store = new HashSet<String>();
        for (String name : names){
            if (store.add(name) == false){
                System.out.println("duplicate element is : "+ name);
            }
        }

        //3. Hashmap:
        Map<String,Integer> storemap = new HashMap<String,Integer>();

        for (String name:names){
            Integer count = storemap.get(name);
            if (count == null){
                storemap.put(name,1);
            }
            else {
                storemap.put(name,++count);
            }
        }

        //get the values from this HashMap:

        Set<Map.Entry<String,Integer>> entrySet = storemap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet) {
            if(entry.getValue()>1){
                System.out.println("duplicate element is : " + entry.getKey());
            }
        }
    }
}
