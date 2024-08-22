class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X에서 숫자가 몇 번 나오는지 보고
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        // Y에서 숫자가 몇 번 나오는지 보고
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder result = new StringBuilder(); // 결과 여기 담음

        // 큰 정수 찾아야 되니까 내림차순으로 공통 숫자 찾아
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        if (result.length() == 0) {
            return "-1";    // 길이가 0이면 -1반환
        }

        if (result.charAt(0) == '0') {
            return "0";     // 맨앞에 0이면 0 반환
        }
        
        return result.toString();
    }
}
