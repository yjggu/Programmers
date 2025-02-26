class Solution {
    public String solution(String my_string, int n) {
       
        StringBuilder sb = new StringBuilder();
        
        for(char ch : my_string.toCharArray()) {
            for(int j=0; j<n; j++) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}