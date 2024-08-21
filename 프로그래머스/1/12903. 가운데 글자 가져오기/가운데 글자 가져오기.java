class Solution {
    public String solution(String s) {
        int length = s.length();    // 길이 재서
        int middle = length / 2;    // 나눠
        
        if (length % 2 == 0) {
            return s.substring(middle - 1, middle + 1); // 짝수면 두개 반환
        } else {
            return s.substring(middle, middle + 1); // 홀수면 한개 반환
        }
    }
}