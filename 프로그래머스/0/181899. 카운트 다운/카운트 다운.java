class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[start_num-end_num+1];
        int index = 0;
        
        for(int i=start_num; i>=end_num; i--) {
            result[index] = i;  // 현재 숫자를 배열에 저장
            index++;  // 다음 배열 인덱스로 이동
        }
        return result;
    }
}


