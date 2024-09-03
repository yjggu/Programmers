class Solution {
    public int solution(String my_string, String is_prefix) {
        int len_pre = is_prefix.length();
        
        if( len_pre > my_string.length()) {
            return 0;
        }
        
        if (my_string.substring(0,len_pre).equals(is_prefix)) {
            return 1;
        }
        return 0;
    }
}