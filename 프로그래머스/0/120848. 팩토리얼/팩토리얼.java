class Solution {
    public int solution(int n) {
        int mul = 1;
        int i = 1;
        
        while(n >= mul){
            mul *= i;
            i++;  
        }
        return i-2;
    }
}