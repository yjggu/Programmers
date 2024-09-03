class Solution {
    public String solution(String my_string) { 
        String result="";
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }
        return result;

    }
}

//         StringBuilder sb = new StringBuilder();

//         for(int i=0; i<my_string.length(); i++) {
//             char ch = my_string.charAt(i);
//             if(Character.isUpperCase(ch)){
//                 sb.append(Character.toLowerCase(ch));
//             } else{
//                 sb.append(Character.toUpperCase(ch));
//             }
//         }
//         return sb.toString();