class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0){
                result[0] += 1;
            }
            else{
                result[1] += 1;
            }
        }
        return result;
    }
}