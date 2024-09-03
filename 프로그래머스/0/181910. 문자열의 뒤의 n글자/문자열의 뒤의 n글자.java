class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
        int start = my_string.length() - n;
        int end = start + n;
        
        for(int i=start; i<end ; i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}