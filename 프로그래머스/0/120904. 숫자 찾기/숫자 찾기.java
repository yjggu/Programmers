class Solution {
    public int solution(int num, int k) {
        String s_num = "" + num;
        char s_k = Character.forDigit(k,10);
        
        for(int i=0; i < s_num.length(); i++){
            if(s_num.charAt(i) == s_k) {
                return i+1;
            }            
        }
        return -1;
    }
}