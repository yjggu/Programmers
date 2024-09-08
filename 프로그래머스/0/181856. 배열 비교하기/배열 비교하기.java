class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int leng1 = arr1.length;
        int leng2 = arr2.length;
        
        if(leng1>leng2){
            return 1;
        } else if (leng1<leng2){
            return -1;
        } else {
            int sum1 = 0;
            int sum2 = 0;
            
            for(int i=0; i<arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1>sum2){
                return 1;
            } else if(sum1<sum2){
                return -1;
            } else {
                return 0;
            }
        }
    }
}