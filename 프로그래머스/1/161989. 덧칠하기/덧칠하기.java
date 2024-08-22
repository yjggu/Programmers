class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0; 
        int lastCovered = 0; 

        for (int start : section) {
            if (start > lastCovered) {
                count++;
                lastCovered = start + m - 1;  
            }
        }

        return count;
    }
}
