package Problems;

import java.util.HashSet;

public class HashSetProblem {
    
    /**
     * Picture this: you're given a vast list of words, and you must identify the final word that 
     * stands proudly solitary — the last word that is not repeated. Imagine sorting through a database 
     * of unique identifiers and finding one identifier towards the end of the list that is unlike any others.
     * 
     * The straightforward approach would be to examine each word in reverse, comparing it to every other word for uniqueness. 
     * This brute-force method would result in poor time complexity, O(n^2), which is less than ideal for large datasets.
     */


     public static void main(String[] args) {
        
        

        String[] words = {"Brad","John", "Brad", "John", "Sam", "Fred", "John"};

       System.out.println(lastUniqueWord(words));
     }

    private static  String lastUniqueWord(String[] words) {
        HashSet<String> wordsSet = new HashSet<>();
        HashSet<String> duplicatesSet = new HashSet<>();

        //Iterate the word array, filling wordsSet and duplicatesSet:
        for (String word : words) {
            if (wordsSet.contains(word)) {
                duplicatesSet.add(word);
            } else {
                wordsSet.add(word);
            }
        }
        System.out.println("wordsSet = "+wordsSet);
        System.out.println("duplicateSet = "+ duplicatesSet);
        //Use the removeAll method from the HashSet API to remove all duplicated words from wordsSet:
        wordsSet.removeAll(duplicatesSet);

        //Now, wordsSet only contains unique words. Find the last unique word by iterating through the original word list from the end:
        String lastUniqueWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
           if (wordsSet.contains(words[i])){
               lastUniqueWord = words[i];
               break;
           }
        }
        //And finally, return the last unique word:
        return lastUniqueWord;
     
    }
}
