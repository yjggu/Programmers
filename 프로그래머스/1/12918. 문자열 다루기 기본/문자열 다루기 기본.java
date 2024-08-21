class Solution {
    public boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) {   // 문자열 길이가 4또는 6이 아니면
            return false;   // 일단 false 떄려
        }

        for (int i = 0; i < s.length(); i++) {  
            if (!Character.isDigit(s.charAt(i))) {  // s문자열의 i번째 문자를 가져와서 숫자인지 확인해
                return false;   // 근데 숫자가 아니면 false
            }
        }
        return true;
    }
}