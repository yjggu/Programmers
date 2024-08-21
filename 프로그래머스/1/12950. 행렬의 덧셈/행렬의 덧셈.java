class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;         // 행 몇개
        int cols = arr1[0].length;      // 열 몇개

        int[][] answer = new int[rows][cols]; // 결과받을 행렬 만들고

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer; // 더한 결과를 반환합니다.
    }
}