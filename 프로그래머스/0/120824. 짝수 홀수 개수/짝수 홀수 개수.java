class Solution {
    public int[] solution(int[] num_list) {
        int evencount = 0;
        int oddcount = 0;
        
        for (int num : num_list){
            if (num%2==0) {
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return new int[] {evencount, oddcount};
    }
}