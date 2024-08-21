class Solution {
    public int[] solution(int[] numbers) {
        int[] twice = new int[numbers.length];
        
        for (int i=0 ; i<numbers.length ; i++){
            twice[i] = numbers[i]*2;
        }
        return twice;
    }
}