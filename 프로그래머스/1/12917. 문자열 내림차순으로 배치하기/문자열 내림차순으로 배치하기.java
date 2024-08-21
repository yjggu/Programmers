import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray(); // 문자열을 배열로 바꿔
        
        Arrays.sort(charArray); // 배열 오름차순
        
        StringBuilder sortedString = new StringBuilder(new String(charArray)).reverse();
        // 정렬된 배열을 문자열로 변환하고, reverse니까 역순으로 (내림차순)
        
        return sortedString.toString();
    }
}