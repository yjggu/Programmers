class Solution {
    public int solution(int[] numbers) {
        int sum = (0+9)*5;
        
        for (int i=0; i < numbers.length ; i++){
             sum -= numbers[i];
        }
        return sum;
    }
}