class Solution {
    public int solution(int slice, int n) {
        int result = 0;
        
        if( n%slice == 0 ) {
            result = n/slice;
        } else {
            if(n%slice > 0){
                result = n/slice + 1 ;
            } else {
                result = n/slice;
            }
        }
        return result;
    }
}