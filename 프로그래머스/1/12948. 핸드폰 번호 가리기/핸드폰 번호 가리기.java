class Solution {
    public String solution(String phone_num) {
        int length = phone_num.length();
        
        String hidden_num = "*".repeat(length-4);
        String four_num = phone_num.substring(length-4);
        
        return hidden_num + four_num;
    }
}