class Solution {
    public int solution(int n) {
        int answer = (n*6)/gcd(n,6);
        
        return answer/6;
    }
    
    
    public int gcd(int a, int  b) {
        if(b ==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}



    
    