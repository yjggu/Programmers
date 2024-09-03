class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int result = 0;

        
        if (length > 10){
            for(int num : num_list) {
                result += num;
            }
        } else {
            result =1;
            for(int num : num_list) {
                result *= num;
            }
        }
        return result;        
    }
}