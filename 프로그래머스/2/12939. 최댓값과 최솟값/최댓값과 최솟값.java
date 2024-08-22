class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        // 문자열 s를 공백을 기준으로 분리 > 숫자 배열

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // 초기 최소값을 Integer의 최대값으로, 초기 최대값을 Integer의 최소값으로 설정

        for (String num : numbers) {
            int n = Integer.parseInt(num);

            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        return min + " " + max; // 공백으로 구분한 문자열
    }
}
