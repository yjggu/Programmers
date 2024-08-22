class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        // 공백을 기준으로 문자열을 분리하여 배열로 만듦
        // 아 공백 유지시키려면 -1 써야된대

        StringBuilder result = new StringBuilder();
        // 결과 여기다 저장할 거

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {

                result.append(words[i].substring(0, 1).toUpperCase()); // 첫 글자를 대문자로 변환
                result.append(words[i].substring(1).toLowerCase()); // 인덱스1부터 끝까지 소문자로 변환
            }
            if (i < words.length - 1) {
                result.append(" "); // 각 단어 뒤에 공백 추가
            }
        }

        return result.toString();
        // 결과 문자열 반환
    }
}
