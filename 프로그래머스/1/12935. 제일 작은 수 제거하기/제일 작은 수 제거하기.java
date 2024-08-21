class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1이면 바로 제거 되니까 return -1
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 일단 첫번째께 min이라고 쳐
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // min보다 작으면 arr[i]가 min이 되는거지
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1]; // 배열 새로 만들건데, 하나 빠지니까 길이에서 1 빼
        int index = 0;
        for (int i = 0; i < arr.length; i++) {  // 인덱스 처음부터 돌릴건데
            if (arr[i] != min) {                // min아니면
                answer[index++] = arr[i];       // 차곡차곡 배열에 담는거지
            }
        }

        return answer;
    }
}