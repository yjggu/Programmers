class Solution {
    public String solution(String my_string) {
        boolean[] seen = new boolean[128];  
        StringBuilder sb = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            if (!seen[ch]) { 
                sb.append(ch);  
                seen[ch] = true;
            }
        }
        
        return sb.toString();
    }
}
