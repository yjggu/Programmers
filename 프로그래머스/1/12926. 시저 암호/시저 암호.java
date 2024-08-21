class Solution {
    public String solution(String s, int n) {
        // s문자열, n만큼 밀어
        StringBuilder result = new StringBuilder();     // 밀고나서 담을 객체

        for (char i : s.toCharArray()) {    // s문자열을 문자타입 배열로 바꿔서 하나씩 꺼내
            if (i >= 'A' && i <= 'Z') {                           // 꺼낸게 대문자면
                char n_swift = (char) ((i - 'A' + n) % 26 + 'A'); // 대문자를 n만큼 이동
                result.append(n_swift);                           // (char) 안붙이면 아스키값 나오네
            } else if (i >= 'a' && i <= 'z') {                    // 꺼낸게 소문자면
                char n_swift = (char) ((i - 'a' + n) % 26 + 'a'); // 소문자를 n만큼 이동
                result.append(n_swift); 
            } else {              // 공백이면
                result.append(i); // 걍 그대로 넣어
            }
        }

        return result.toString(); // result에 담아둔거 문자열로 반환
    }
}