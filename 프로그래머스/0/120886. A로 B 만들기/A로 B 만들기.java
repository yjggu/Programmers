import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        if(Arrays.equals(beforeArray, afterArray)){
            return 1;
        }
        return 0;
    }
}