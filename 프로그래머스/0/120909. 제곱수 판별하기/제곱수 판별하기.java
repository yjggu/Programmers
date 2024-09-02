class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt){
            return 1;
        }
        return 2;
    }
}


// isDigit()은 char타입에 대해서만 사용 가능