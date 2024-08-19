class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        int originx = x;
        
        while(x>0){
            sum += x%10;
            x /=10;
        }
        return (originx % sum == 0);
    }
}