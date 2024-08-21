class Solution {
    public int solution(int[] array, int height) {
        // array : 반친구들 키 / height : 머쓱이 키
        int count = 0;
        
        for (int i=0 ; i<array.length; i++) {
            if( array[i] > height){
                count++;
            }
        }
        return count;
    }
}