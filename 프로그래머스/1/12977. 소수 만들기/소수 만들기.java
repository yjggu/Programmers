import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int maxSum = 3000;
        boolean[] isPrime = sieveOfEratosthenes(maxSum);
        
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime[sum]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        return isPrime;
    }
}
