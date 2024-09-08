class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                result.append('A'); 
            } else if (c >= 'A' && c <= 'Z' && c != 'A') {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); 
            }
        }

        return result.toString();
    }
}
