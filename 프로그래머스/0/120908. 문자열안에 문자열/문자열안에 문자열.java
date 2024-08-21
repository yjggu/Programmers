class Solution {
    public int solution(String str1, String str2) {
        // str1 안에 str2가 있다면 1, 없으면2
        if(str1.contains(str2)){
            return 1;
        }
        return 2;
    }
}