class Solution {
    public int solution(int a, int b) {

        int sum_ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int mul_ab = 2 * a * b;
        
        return (sum_ab >= mul_ab) ? sum_ab : mul_ab;
    }
}
