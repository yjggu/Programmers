class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);      // 최대공약수 구하기
        int lcm = (n * m) / gcd;  // 최소공배수는 두개 곱한거에서 공약수 나누면 돼

        return new int[]{gcd, lcm};
    }

    // 유클리드 호제법으로 풀어보쟈
    private int gcd(int a, int b) {     // 나머지==0될 때까지 계속 나눠
        while (b != 0) {    // 나머지가 0이 아니면 계속 돌려
            int temp = b;   // 나머지
            b = a % b;      // 몫에서 나머지를 계속 나눠서 나머지를 구해
            a = temp;       // 이전에 나머지였던게 이제 몫이 되는거잖아
        }
        return a;
    }
}