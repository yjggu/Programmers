import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int result=0;
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                result += Character.getNumericValue(ch);
            }
        }
        return result;
    }
}