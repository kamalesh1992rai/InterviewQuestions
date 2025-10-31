package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement3 {

    public static void main(String[] args){

        List<String> myList = Arrays.asList("a","b","c","a");
        Set<String> set = new HashSet<>();
        for (String s : myList){
            if (!set.add(s))
                System.out.println("Duplicate: "+ s);
        }
    }
}
