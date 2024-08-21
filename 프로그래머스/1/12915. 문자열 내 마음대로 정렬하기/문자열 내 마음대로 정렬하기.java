import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // strings : 문자열로 구성된 리스트, n : 각 문자열의 인덱스
        Arrays.sort(strings, (s1, s2) -> {          // 문자열들 중에서 두개 비교해
            if (s1.charAt(n) == s2.charAt(n)) {     // n번째 인덱스가 같으면
                    return s1.compareTo(s2);        // 사전순으로
            } else {
                return s1.charAt(n) - s2.charAt(n); // n번째 문자를 기준으로 비교
            }
        });

        return strings; // 정렬된 배열 반환
    }
}
