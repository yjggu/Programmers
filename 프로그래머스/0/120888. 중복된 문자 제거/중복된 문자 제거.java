import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {

        Set<Character> result = new LinkedHashSet<>();
        
        for (char ch : my_string.toCharArray()) {
            result.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : result) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
