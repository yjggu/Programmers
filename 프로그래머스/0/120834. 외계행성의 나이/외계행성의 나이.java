class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<ageStr.length(); i++) {
            char ch = (char) ('a' + (ageStr.charAt(i) - '0'));
            result.append(ch);
        }
        return result.toString();
    }
}