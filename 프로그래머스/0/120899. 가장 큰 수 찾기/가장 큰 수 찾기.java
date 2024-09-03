import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];
        int max = array[0];
        int index = 0;
        
        for(int i=1; i<array.length; i++) {
            if(array[i]>max){
                max = array[i];
                index = i;
            }
            result[0] = max;
            result[1] = index;
        }

        return result;
    }
}