package MapExamples;

import java.util.HashMap;

public class MapAndHashMapExamples {
    
    public static void main(String[] args) {
        // We are going to have the names be the key and the id as the values in the maps
        
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 1);
        empIds.put("Jim", 2);
        empIds.put("Sal", 23);
        empIds.put("Kevin", 1345);
        empIds.put("Saul", 1342456);

        System.out.println(empIds);

        //to get an id of person
        System.out.println(empIds.get("John"));
        System.out.println(empIds.containsKey("Smith"));
        System.out.println(empIds.containsValue(1));

        empIds.replace("John",777);
        System.out.println(empIds);

        empIds.putIfAbsent("Neo", 1230);
        System.out.println(empIds);

    }
}
