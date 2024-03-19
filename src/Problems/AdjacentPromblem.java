package Problems;

public class AdjacentPromblem {

    public static void main(String[] args) {
        int[] input = {3, 6, -2, -5, 7, 3}  ;
        System.out.println(solution(input));
        
    }

    private static int solution(int[] inputArray) {
        int max= 0,temp = 0;
        for(int i = 0 ; i < inputArray.length-1 ; i++){
                if(i == inputArray.length) break;

                temp = inputArray[i] * inputArray[i + 1];
            
                if( temp > max) max = temp;
            }
            return max;
    } 
    
}


