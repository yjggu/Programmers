class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {   // left ~ right까지 수들 중
            int divisorCount = 0;   // 약수 개수 카운트할 변수

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;         // 나누어 떨어지는거 개수 세고
                }
            }

            if (divisorCount % 2 == 0) {    // 약수 개수가 짝수이면
                answer += i;        // 더하고
            } else {                        // 홀수이면
                answer -= i;        // 빼고
            }
        }
        return answer;
    }
}