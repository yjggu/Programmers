class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();
        
        c -= 1;
        
        for (int i = c; i < my_string.length(); i += m) {
            result.append(my_string.charAt(i));
        }
        
        return result.toString();
    }
}
