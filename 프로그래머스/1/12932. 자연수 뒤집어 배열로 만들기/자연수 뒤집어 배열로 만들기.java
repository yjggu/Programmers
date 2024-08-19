class Solution {
    public int[] solution(long n) {
        // 정수에 상용로그 씌우고 +1 하면 자릿 수 나타내잖아
        int length = (int)Math.log10(n) +1;
        // 자릿수만큼 배열 만들어주고
        int[] answer = new int[length];

        for (int i=0 ; i<length; i++){
            answer[i]= (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}