class Solution {
    public int solution(int num) {
        int count = 0;

        while (count < 400) {
            if (num == 1) {
                return count; // num이 1이면 반복 횟수 반환
            }
            
            // 짝수인 경우
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } 
            // 홀수인 경우
            else {
                num = num * 3 + 1;
                count++;
            } 
        }

        // 500번을 초과하면 -1 반환
        return -1;
    }
}
