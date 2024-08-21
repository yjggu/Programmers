class Solution {
    public int solution(int num1, int num2) {
        double div = 0;
        int answer = 0;
        
        div = (double)num1 / num2 * 1000;
        answer = (int)div;
        
        return answer; 
    }
}