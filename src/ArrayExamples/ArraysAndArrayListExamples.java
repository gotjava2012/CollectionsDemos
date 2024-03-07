package ArrayExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayListExamples {
    

    public static void main(String[] args) {
        
        /**
         * Used when you have a group or collection of the same type of objects
         * Ways to initialize Arrays and ArrayLists
         */
        // arrays when initialized with a set value will only be able to hold that set value
         String[] friends = new String[4];
         //or
         String[] friends2 = {"Chris","Eric", "Lucy","Sam"};


         // ArrayLists can not hold primitives  i.e not ints use the wrapper class Integer
         //ArrayLists can grow dynamically so no set size as in Arrays
         ArrayList<String> arrList = new ArrayList<>();
         //or
         ArrayList<String> arrList2 = new ArrayList<>(Arrays.asList("Chris","Eric", "Lucy","Sam"));


        // All arrays start at index 0
        System.out.println(friends2[1]);
        //or
        System.out.println(arrList2.get(1));

        //Find the size
        System.out.println(friends2.length);
        //or
        System.out.println(arrList2.size());

        //Adding elements to the arrays
        friends[0] =  "Jimmy";
        System.out.println(friends[0]);
        //or
        arrList.add("Frankenstein");
        System.out.println(arrList.get(0));


        //Remove elements within Array
        //Not possible with Arrays but with ArrayLists you can
        arrList.remove("Frankenstein");
        System.out.println(arrList);

        System.out.println(friends2); // when you go to print this out you get the object location in memory. You will need to iterate through the array to print
        // or
        System.out.println(arrList2);

    }

  
}
