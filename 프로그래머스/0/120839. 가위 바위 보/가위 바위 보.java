import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        Map<Character, Character> rspMap = new HashMap<>();
        rspMap.put('2', '0');
        rspMap.put('0', '5');
        rspMap.put('5', '2');
        
        StringBuilder result = new StringBuilder();
        
        for (char ch:rsp.toCharArray()){
            result.append(rspMap.get(ch));
        }
        return result.toString();
    }
}