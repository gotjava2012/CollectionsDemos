package Problems;

import java.util.HashSet;

public class Problem2 {


    public static String findFirstDuplicateID(String[] ids) {
        HashSet<String> idSet = new HashSet<>();
        HashSet<String> idDupSet = new HashSet<>();

        // TODO: Find an id that appears more than once and return it
        for(String id : ids){
            if(idSet.contains(id)){
                idDupSet.add(id);
            } 
            else idSet.add(id);
        }
        // Return an empty string if no duplicate ids are found
        if(!idDupSet.isEmpty()){
            return idDupSet.stream().findFirst().get();
        } else
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findFirstDuplicateID(new String[]{"X123", "A456", "X123", "B789", "A456", "C111"})); // Expected "X123"
        System.out.println(findFirstDuplicateID(new String[]{"Z999", "Y888", "Z999", "Y888"})); // Expected "Z999"
        System.out.println(findFirstDuplicateID(new String[]{"E100", "B200", "C300", "E100", "D400", "C300"})); // Expected "E100"
    }

}
