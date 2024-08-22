class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
           
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
        }
        
        return result.toString();
    }
}