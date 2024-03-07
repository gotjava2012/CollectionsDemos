package SetExamples;
import java.util.*;

class LinkedHashSetExample {
    
    public static void main(String[] args) {
        /***
         * Uses when you care about insertion ording of elements when added to the Set. 
         * 
         */
        
        Set<String> namSet = new LinkedHashSet<>();

        namSet.add("Walter");
        namSet.add("Sklyer");
        namSet.add("John");
        namSet.add("Mike");
        namSet.add("Saul");


        // namSet.remove("Walter");
        // namSet.add("Walter"); // only get added once 

        System.out.println(namSet);
        System.out.println(namSet.size());
        System.out.println(namSet.isEmpty());


        //Looping through set
        for(String name : namSet){
            System.out.println(name);
        }

        namSet.forEach(System.out::println);

        Iterator<String> itr = namSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        List<Integer> list = Arrays.asList(1,2,3,4,55,55,5,6,7,4,4,9);
        Set<Integer> intSet = new LinkedHashSet<>();
        Set<Integer> intSet2 =  new LinkedHashSet<>(list);
        intSet.addAll(list);
        System.out.println(intSet);
        System.out.println(intSet2);

     

    }
}