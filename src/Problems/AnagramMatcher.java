package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class AnagramMatcher {
    
    public static void main(String[] args) {
        
        /**
         * Now, imagine a different scenario in which you have two arrays of strings, and your task is to find all the unique words from the first array that have an anagram in the second array.
         * We'll create a unique signature for each word by sorting its characters and then compare these signatures for matches. We'll use a hashmap to store signatures for efficient access.
         */

        //Store these sorted characters from array2 in a HashSet for fast lookup:
         HashSet<String> sortedWordsInArray2 = new HashSet<>();
       
        String[] array1 = {"John", "Sam","Bill","Saul", "Doe"};
        String[] array2= {"John", "Sam","Bill", "Smith"};

        for (String word : array2) {
            sortedWordsInArray2.add(sortCharacters(word));
        }

        System.out.println(matches(array1, sortedWordsInArray2));



        //By utilizing HashSets in this manner, we achieve efficient anagram checking with reduced complexity, considering both the O(mlogm)
        // O(n) character sorting for each word and the comparison for n words.
 
    }
            //Construct a method to create sorted character signatures from the input string:
            private static String sortCharacters(String input) {
                char[] chars = input.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
             }

            private static ArrayList matches(String[] array1, HashSet sortedWordsInArray2 ){

                //For each word in array1, check for its sorted signature in the HashSet and track the found anagrams:
            
                HashSet<String> anagramsMatched = new HashSet<>();
                ArrayList<String> result = new ArrayList<>();
                
                for (String word : array1) {
                    if (sortedWordsInArray2.contains(sortCharacters(word))) {
                        if (!anagramsMatched.contains(word)) {
                            result.add(word);
                            anagramsMatched.add(word);
                        }
                    }
                }
                return result;
                //The ArrayList result stores the matches, ensuring that we return unique anagrams, while the HashSet anagramsMatched prevents duplication in our result.
             }
}
