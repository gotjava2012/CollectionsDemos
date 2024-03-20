package Problems;

import java.util.Set;
import java.util.TreeSet;

public class IncreasingSequence {
    
    public static void main(String[] args) {
   
        int[] input = {13, 6, 5, 8, 10, 20, 15}; 
        System.out.println(solution( input));
    }

    private static boolean solution(int[] sequence) {
          boolean output = false;
        Set tree = new TreeSet<>();
        if( sequence.length == 3) return threeCheck(sequence[0], sequence[1],sequence[2]);
     
        for(int i = 0 ; i < sequence.length - 2 ; i ++){
            int curr = sequence[i];
            int nextVal = sequence[i+1];
            int nextNextVal = sequence[i+2];
            
            if(!tree.contains(curr)) {
                tree.add(curr);
            }
            
            if(sequence.length > 3 && i != sequence.length-2 && !tree.contains(curr)){
                output = threeCheck(curr, nextVal, nextNextVal);
            }
            
            
            if( i == sequence.length - 3) {
                output = threeCheck(curr, nextVal, nextNextVal);
                tree.add(curr);
                tree.add(nextVal);
                tree.add(nextNextVal);
                break;
            }
        
        }
            if ( tree.size() == sequence.length) output = true;
            else output = false;
System.out.println(tree);
        return output;
}
    private static boolean threeCheck( int one , int two, int three){
        boolean val = false; 
        if( one < two && two < three && one < three) val =  true;
        if( two > one && two < three ) val= true;
        if (three > one && three > two) val = true;
       
      return val;
    }
}
