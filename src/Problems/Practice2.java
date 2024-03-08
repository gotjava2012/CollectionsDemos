package Problems;

import java.util.*;

/**
 * Picture two log files, each a whole array of words. 
 * Find the unique words from the second log file that have an anagram in the first log file. 
 * Then, add up the length of these matching anagram words. 
 * You must return this total length as an integer. 
 * Now, remember, anagrams are words that have the same letters but rearranged. 
 * If a word has no anagram in the other array or if it's not unique in its own array, abandon it like a black hole. 
 * Don't worry, whether these arrays have one word or a thousand, your code should be ready! 
 */

public class Practice2 {

    // Method to return a unique character signature for each string.
    static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to find unique words from array2 that have an anagram in array1 
    public static int findAnagrams(String[] array1, String[] array2) {
        HashSet<String> sortedWordsInArray1 = new HashSet<>();
        HashSet<String> sortedWordsInArray2 = new HashSet<>();
        // TODO: fill in sortedWordsInArray1
        for( String word : array1){
            sortedWordsInArray1.add(sortCharacters(word));
        }
        System.out.println("first array "+sortedWordsInArray1);
        HashSet<String> anagramsMatched = new HashSet<>();
        int lengthSum = 0;

        for (String word : array2) {
            // implement this
            sortedWordsInArray2.add(sortCharacters(word));
        }
       System.out.println("Second array "+ sortedWordsInArray2);
       Iterator itr = sortedWordsInArray1.iterator();
       while(itr.hasNext()){
            String word = (String) itr.next();
       
            if(sortedWordsInArray1.contains(sortCharacters(word)) 
            && sortedWordsInArray2.contains(sortCharacters(word))){
               anagramsMatched.add(sortCharacters(word));
            }
        }
        System.out.println(anagramsMatched);
        for(String word : array1){
            if(!anagramsMatched.contains(sortCharacters(word))){
                System.out.println(word);
                if(lengthSum < word.length()) lengthSum = word.length();
            }
        }
        System.out.println("Length sum is "+lengthSum);
        return lengthSum;
    }
    
    public static void main(String []args){
        String[] array1 = {"cat", "dog", "tac", "god", "act"};
        String[] array2 = {"tca", "ogd", "atc", "taco"};
        int result = findAnagrams(array1, array2);
        System.out.println(result);   // output: 9

        // additional test samples
        String[] array3 = {"rat", "tar", "bat", "tab","bats"};
        String[] array4 = {"tra", "art", "abr"};
        int result2 = findAnagrams(array3, array4);
        System.out.println(result2);  // output: 6
    }
}