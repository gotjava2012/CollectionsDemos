package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class ConsecutiveArrays {
    public static void main(String[] args) {

        int[] arr = { 6, 2, 3, 8};
        System.out.println(solution( arr ));
    }

    private static int  solution(int[] statues) {
        List<Integer> output = Arrays.stream(statues).boxed().collect(Collectors.toList());
        Collections.sort(output);
 
        int first = output.get(0);
        int last = output.get(output.size() - 1);
        
        IntStream stream = IntStream.range(first, last); 
        int[] arr = stream.toArray(); 
        int num = 0;

        for( int i = 0 ; i < arr.length ; i ++){
            if(!output.contains(arr[i])) {
                num++;
            }
        }
      
         return num;                 
    }

}