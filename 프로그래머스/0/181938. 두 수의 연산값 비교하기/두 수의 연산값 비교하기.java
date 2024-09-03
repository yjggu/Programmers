class Solution {
    public int solution(int a, int b) {
        String sum_ab = "";
        int mul_ab = 1;
        
        sum_ab = Integer.toString(a) + Integer.toString(b);
        mul_ab = 2*a*b;
        
        return (Integer.parseInt(sum_ab) > mul_ab) ? Integer.parseInt(sum_ab) : mul_ab;
    }
}