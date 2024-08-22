import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int n = numbers.length;
        int product1 = numbers[n - 1] * numbers[n - 2]; // 가장 큰 두 수의 곱
        int product2 = numbers[0] * numbers[1];         // 가장 작은 두 수의 곱 (음수 곱셈의 가능성)

        // 두 곱셈 결과 중 더 큰 값을 반환
        return Math.max(product1, product2);
    }
}
