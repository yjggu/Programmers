class Solution {
    public int solution(int n) {
        int sum = 0;
        
        if(n%2==1) {
            for (int i=1; i<=n; i+=2){
                sum += i;
            }
        } else if(n%2==0) {
            for (int i=0; i<=n; i+=2) {
                sum += i*i;
            }
        }
        
        return sum;
    }
}