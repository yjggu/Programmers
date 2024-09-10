class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        
        for(int i=0; i<included.length; i++) {
            if(included[i]) {
                int temp = d*i + a;     // 3  15  19
                sum += temp;
            }
        }
        return sum;
    }
}