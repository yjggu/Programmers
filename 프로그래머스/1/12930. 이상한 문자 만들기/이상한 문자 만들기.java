class Solution {
    public String solution(String s) {

        String[] words = s.split(" ", -1);  //공백 기준으로 나눌게
        
        StringBuilder result = new StringBuilder(); // return 될 값은 여기에 담을게
        
        for (int i = 0; i < words.length; i++) {    // 단어 돌리는데
            String word = words[i]; 
            StringBuilder transformedWord = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);    // 단어 안에 j번째 문자 가져와봐
                if (j % 2 == 0) {
                    transformedWord.append(Character.toUpperCase(c)); // 짝수 인덱스면 대문자
                } else {
                    transformedWord.append(Character.toLowerCase(c)); // 홀수 인덱스면 소문자
                }
            }
            
            result.append(transformedWord); // 리턴된 단어들 다 넣어
            
            if (i < words.length - 1) { // 단어들 사이에 공백 추가할건데 맨 마지막은 필요없으니까 인덱스에서 빼
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}