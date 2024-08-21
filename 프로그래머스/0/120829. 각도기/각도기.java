class Solution {
    public int solution(int angle) {
        double ang = 0.0;
        ang = (double)angle / 90;
        
        if (0 < ang & ang< 1){
            return 1;
        } else if( ang == 1 ){
            return 2;
        } else if (1 < ang & ang< 2) {
            return 3;
        } 
        return 4;
    }
}