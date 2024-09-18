class Solution {
    public int solution(int[] array, int n) {
        
        int closest = array[0];                   // 초기화
        int minDiff = Math.abs(array[0] - n);     // 초기화

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); 
            
            if (diff < minDiff) {
                minDiff = diff;
                closest = array[i];
            } 

            else if (diff == minDiff && array[i] < closest) {
                closest = array[i];
            }
        }

        return closest; 
    }
}
