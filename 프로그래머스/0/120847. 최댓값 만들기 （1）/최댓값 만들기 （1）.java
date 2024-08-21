import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);   // 일단 정렬
        
        int numLength = numbers.length;
        return numbers[numLength-2] * numbers[numLength -1];
    }
}