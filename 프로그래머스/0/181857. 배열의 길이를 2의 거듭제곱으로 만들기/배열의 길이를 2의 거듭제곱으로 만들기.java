import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int length = arr.length;
        
        int newSize = 1;
        
        while(newSize < length) {
            newSize *= 2;
        }
        
        int[] result = Arrays.copyOf(arr, newSize);
        
        return result;
    }
}