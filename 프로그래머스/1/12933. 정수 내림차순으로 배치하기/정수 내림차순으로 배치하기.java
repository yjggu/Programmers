import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        // 숫자를 문자열로 변환후 배열에 저장
        
        Arrays.sort(chars);
        // 배열 순서 오름차순으로 
        
        StringBuilder sb = new StringBuilder(new String(chars)).reverse();
        // 배열 내림차순으로 다시 배치
        
        return Long.parseLong(sb.toString());
        // 결과 Long타입으로 변환
    }
}