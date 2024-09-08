class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        int idx = 0;
        
        for(int i=num_list.length -1; i>=0; i--){
            result[idx] = num_list[i];
            idx++;
        }
        return result;
    }
}