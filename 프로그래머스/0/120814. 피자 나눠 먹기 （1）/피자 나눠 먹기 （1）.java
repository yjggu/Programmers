class Solution {
    public int solution(int n) {
        // n: 사람 수
        if(n<7) {
            return 1;
        } else if(n%7==0){
            return n/7;
        }
        return (n/7)+1;
    }
}