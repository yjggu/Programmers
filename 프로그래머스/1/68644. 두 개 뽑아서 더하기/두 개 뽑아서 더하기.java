import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>(); // TreeSet을 사용해 중복 제거와 동시에 정렬
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j]; // 두 수의 합 계산
                resultSet.add(sum);                // 합한 거 넣어 어차피 set라서 중복알아서 제거됨
            }
        }
        
        int[] result = new int[resultSet.size()];   // 결과 저장할 배열 생성
        int index = 0;                              // 인덱스 초기화
        for (int num : resultSet) {         // resultSet에 있는 요소 꺼낼 거
            result[index++] = num;          // result 배열의 index 위치에 num 값을 저장하고, index 1씩 증가시킴
        }
        
        return result; // 결과 배열 반환
    }
}