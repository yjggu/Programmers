import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        int max = 0;
        
        Arrays.sort(numbers);
        
        for(int i=0; i<len; i++) {
            int max_left = numbers[0]*numbers[1];
            int max_right = numbers[len-1]*numbers[len-2];
            
            max = (max_left > max_right) ? max_left : max_right;
        }
        return max;
    }
}