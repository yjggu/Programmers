import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        for( char ch : s.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0) +1);
        }
        
        StringBuilder result = new StringBuilder();
        
        for( char ch: s.toCharArray()) {
            if(countMap.get(ch)==1){
                result.append(ch);
            }
        }
        
        char[] resultArray = result.toString().toCharArray();
        Arrays.sort(resultArray);
        
        return new String(resultArray);
        
    }
}