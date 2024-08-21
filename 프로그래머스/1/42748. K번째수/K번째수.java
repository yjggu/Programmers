import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // array : 주어진배열 / commands : [i,j,k] i번째~j번째 중 정렬 후 k번째
        
        int[] answer = new int[commands.length]; // 결과 담을 거

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작
            int end = commands[i][1];   // 끝
            int k = commands[i][2];     // 시작과 끝 사이 k번째 값 추출
            
            int[] subArray = new int[end - start + 1]; // 뽑아낸거 담을 배열
            
            for (int j = 0; j < subArray.length; j++) { 
                subArray[j] = array[start - 1 + j];    // 범위에 맞게 배열에 담아
            }
            
            Arrays.sort(subArray); // 담은거 오름차순으로 정렬

            answer[i] = subArray[k - 1];    // 정렬된거에서 k번째만 찾아
        }
        
        return answer; // 결과 배열 반환
    }
}