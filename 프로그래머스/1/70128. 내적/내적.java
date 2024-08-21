class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {    // 내적이면 a나 b나 길이 같을 거 아녀
            answer += a[i] * b[i];
        }
        return answer;
    }
}