import java.util.*;

class TreeSetExample {
    
    public static void main(String[] args) {
        /***
         * Uses when you don't want duplicates in a collection
         * A Treeset will add items based on natural order
         * This uses a tree not a Hash  so elements get added in order
         * A hashSet is way faster then a treeSet. So its better to use a Hashset for speed but if you 
         * need order use a TreeSet
         */
        
        Set<String> namSet = new TreeSet<>();

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
        Set<Integer> intSet = new TreeSet<>();
        Set<Integer> intSet2 =  new TreeSet<>(list);
        intSet.addAll(list);
        System.out.println(intSet);
        System.out.println(intSet2);



    }
}