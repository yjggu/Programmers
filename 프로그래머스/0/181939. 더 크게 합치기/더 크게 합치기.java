class Solution {
    public int solution(int a, int b) {

        String sum1 = a + "" + b;
        String sum2 = b + "" + a;
        
        if (sum1.compareTo(sum2) >= 0) {
            return Integer.parseInt(sum1);
        } else {
            return Integer.parseInt(sum2);
        }
    }
}
