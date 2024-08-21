class Solution {
    public String solution(String my_string) {
      
        StringBuilder sb = new StringBuilder(my_string);    // 가변한 문자열 객체로 만들어
        sb.reverse();   // 뒤집고.
        
        return sb.toString();   // 문자열로 반환
    }
}