import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(Character.isDigit(ch)){
                result.add(Character.getNumericValue(ch));
            }
        }
        
        Collections.sort(result);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}