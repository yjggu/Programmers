class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        
        int[] result = new int[length]; // 결과

        for (int i = n; i < length; i++) {
            result[i - n] = num_list[i];    // 뒷부분 앞에 복사
        }
        for (int i = 0; i < n; i++) {
            result[length - n + i] = num_list[i];   // 앞에꺼 뒤로 복사
        }

        return result;
    }
}
