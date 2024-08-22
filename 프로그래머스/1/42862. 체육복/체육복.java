import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        
        // 각 학생의 체육복 개수를 저장하는 배열 초기화
        int[] student = new int[n];
        Arrays.fill(student, 1);  // 모든 학생은 처음에 체육복을 1개씩 가지고 있음
        
        // 체육복을 잃어버린 학생의 체육복 개수를 1 감소
        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1] -= 1;
        }
        
        // 여벌 체육복이 있는 학생의 체육복 개수를 1 증가
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1] += 1;
        }
        
        // 체육복 빌려주기 처리
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 2) {  // 여벌 체육복이 있는 경우
                if (i - 1 >= 0 && student[i - 1] == 0) {  // 왼쪽 학생이 체육복이 없는 경우
                    student[i - 1] = 1;
                    student[i] = 1;
                } else if (i + 1 < student.length && student[i + 1] == 0) {  // 오른쪽 학생이 체육복이 없는 경우
                    student[i + 1] = 1;
                    student[i] = 1;
                }
            }
        }
        
        // 체육복을 가진 학생 수 계산
        for (int i = 0; i < student.length; i++) {
            if (student[i] > 0) {
                result++;
            }
        }
        
        return result;
    }
}