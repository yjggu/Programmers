class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {  // 50보다 크거나 같은 짝수
                result[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {  // 50보다 작은 홀수
                result[i] = arr[i] * 2;
            } else {
                result[i] = arr[i];  // 나머지 경우에는 원래 값을 유지
            }
        }
        return result;
    }
}
