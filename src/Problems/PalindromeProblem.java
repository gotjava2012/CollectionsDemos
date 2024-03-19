package Problems;

import java.util.stream.IntStream;

public class PalindromeProblem {

    public static void main(String[] args) {

        String text ="abcdcba";

       System.out.println("Simple approach "+ isPalindrome(text)); 
       System.out.println("Reversing approach "+ isPalindromeReverseTheString(text)); 
       System.out.println("StringBuffer approach "+ isPalindromeUsingStringBuffer(text)); 
       System.out.println("StringBuilder approach "+ isPalindromeUsingStringBuilder(text)); 
       System.out.println("Stream approach "+ isPalindromeUsingIntStream(text)); 
       System.out.println("Recursive approach "+ isPalindromeRecursive(text)); 
        
    }

    // A Simple Approach
// We can simultaneously start iterating the given string forward and backward, one character at a time. 
//If the there is a match the loop continues; otherwise, the loop exits:
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    /***
     * Reversing the String
There are a few different implementations that fit this use case: we can make use of the API methods from 
StringBuilder and StringBuffer classes when checking for palindromes, or we can reverse the String without these classes.
     */

     public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }

    public static boolean isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
    
    public static boolean isPalindromeUsingStringBuffer(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    //Using Stream API

    public static boolean isPalindromeUsingIntStream(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    //Using Recursion
    public static boolean isPalindromeRecursive(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }
    
    private static boolean recursivePalindrome(String text, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((text.charAt(forward)) != (text.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(text, forward + 1, backward - 1);
        }
    
        return true;
    }

}


