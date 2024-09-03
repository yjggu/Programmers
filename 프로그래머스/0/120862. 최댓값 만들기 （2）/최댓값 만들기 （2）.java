import java.util.Arrays;
// Math.abs();
class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        int max = 0;
        Arrays.sort(numbers);
        
        for(int i=0; i<len; i++) {
            int num1 = numbers[0]*numbers[1];
            int num2 = numbers[len-1]*numbers[len-2];
            
            max = (num1 > num2) ? num1 : num2;
        }
        return max;
    }
}