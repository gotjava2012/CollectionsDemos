package Problems;

import java.util.HashMap;


public class Anagram {
    
    public static void main(String[] args) {
        
        String word1 = "nameless";
        String word2 ="salesman";
       System.out.println(isAnagram( word1 , word2));
    }
    public static boolean isAnagram(String word1, String word2){

        HashMap<Character, Integer> map1 =charFrequencyUsingContainsKey(word1);
        HashMap<Character, Integer> map2 = charFrequencyUsingContainsKey(word2);

        if(map1.size() != map2.size()) return false;
       
        boolean result = mapCompare(map1,map2);
 
        return result;
    
    }
    
    private static boolean mapCompare(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        boolean result = false;
        for(  Character i : map1.keySet()){
            if( ! map2.containsKey(i)) 
                result = false;
            if( !map1.get(i).equals(map2.get(i))) 
                result =  false;
            else
                result =  true;
           }
           return result;
    }
    public static HashMap<Character, Integer> charFrequencyUsingContainsKey(String sentence) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int c = 0; c < sentence.length(); c++) {
            int count = 0;
            if (charMap.containsKey(sentence.charAt(c))) {
                count = charMap.get(sentence.charAt(c));
            }
            charMap.put(sentence.charAt(c), count + 1);
        }
        return charMap;
    }

}
