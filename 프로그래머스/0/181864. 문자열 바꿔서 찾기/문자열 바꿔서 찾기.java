class Solution {  //  myString.toCharArray   .toString().contains(
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for( char ch : myString.toCharArray()) {
            if( ch == 'A') {
                sb.append('B');
            } else if (ch == 'B') {
                sb.append('A');
            } else {
                sb.append(ch);
            }
        }
        
        if(sb.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
