package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args){

        int[] a = new int[3]; //static array --size is fixed

        //dynamic array -- ArrayList:
        //1. can contain duplicate values/elements
        //2. maintains insertion order
        //3. Synchronized
        // allows random access to fetch the element because it stores the values on the basis of indexes


        ArrayList ar = new ArrayList();

        ar.add(10); //0
        ar.add(20); //1
        ar.add(30); //2

        System.out.println(ar.size());

        ar.add(40);//3
        ar.add(50);//4
        ar.add(50);//5

        System.out.println(ar.size()); //size of arraylist
        System.out.println(ar.get(4)); // to get the value from an index

        //to print all the values from arraylist:
        //1. for loop
        //2. using iterator

        for (int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        // non generic vs generic


    }







}
