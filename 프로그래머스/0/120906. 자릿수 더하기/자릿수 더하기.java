class Solution {
    public int solution(int n) {
        String num = Integer.toString(n);
        int result = 0;
        
        for (char ch : num.toCharArray()) {
            result += ch - '0';
        }
        return result;
    }
}