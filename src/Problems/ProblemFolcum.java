package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemFolcum {

    /**
 * problem
 * Input  : arr1[] = { 5, 8, 9}  
         arr2[] = {4, 7, 8}
        Output : arr3[] = {4, 5, 7, 8, 8, 9}
 */


    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9};
        int[] arr2 = {4,7,8};
       
        List<Integer> list = new ArrayList<>();

        for( int e : arr1){
            list.add(e);
        }

        for( int e : arr2){
            list.add(e);
        }
        
        Collections.sort(list);

        System.out.println(list);
        
    }

    
}
