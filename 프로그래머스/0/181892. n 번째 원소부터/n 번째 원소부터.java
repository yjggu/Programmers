class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] result = new int[length-n+1];

        for (int i=n-1;i<length;i++ ){
            result[i-n+1] = num_list[i];
        }
        return result;
    }
}