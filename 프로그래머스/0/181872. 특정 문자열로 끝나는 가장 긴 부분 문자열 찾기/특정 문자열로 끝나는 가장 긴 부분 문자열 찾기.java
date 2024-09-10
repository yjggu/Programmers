class Solution {
    public String solution(String myString, String pat) {
        int lastIdx = myString.lastIndexOf(pat);
        
        if(lastIdx == -1) {
            return "";
        }
        return myString.substring(0, lastIdx + pat.length());        
    }
}