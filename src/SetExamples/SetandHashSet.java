package SetExamples;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class SetandHashSet {
    
    public static void main(String[] args) {
        /***
         * Uses when you don't want duplicates in a collection
         * A set can not contain any duplicates.  So you can dump a list into a set and remove duplicates
         * A HashSet is an intrinsic part of Java's collections framework. It is designed to store unique elements in an unordered manner. 
         * As a class derived from the AbstractSet class and implementing the Set interface, 
         * a HashSet doesn't conform to the order in which elements are added. 
         * This gives its users the freedom not to maintain any sequencing while ensuring every stored element is distinct.
         * A HashSet stands out among Set implementations due to its ability to eliminate duplicate data. 
         * This makes it highly efficient when we need to swiftly check if an item exists in a collection or when we want 
         * to store only the unique data.
         */
        
        Set<String> namSet = new HashSet<>();

        namSet.add("Walter");
        namSet.add("Sklyer");
        namSet.add("John");
        namSet.add("Mike");
        namSet.add("Saul");

        namSet.remove(0); // does nothing since its not in any particular order in the set
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
        Set<Integer> intSet = new HashSet<>();
        Set<Integer> intSet2 = new HashSet<>(list);
        intSet.addAll(list);
        System.out.println(intSet);
        System.out.println(intSet2);

        // Constant time with add, remove or lookups with a Hashset no matter how big or small it is
        //HashSet's O(1) complexity in methods like .add() and .contains().

    }
}