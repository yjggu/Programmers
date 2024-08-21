class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        // StringBuilder  : 가변적인 문자열을 다룰 때 좋지
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수"); // 짝수인덱스에서 수
            } else {
                sb.append("박"); // 홀수인덱스에서 박
            }
        }
        
        return sb.toString();   // 최종적으로 나온 문자열 반환
    }
}