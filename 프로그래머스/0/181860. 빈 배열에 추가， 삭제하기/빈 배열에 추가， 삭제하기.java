import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {                              // flag가 true 라면
                for (int j = 0; j < arr[i] * 2; j++) {  // arr[i] x 2번을
                    x.add(arr[i]);                      // 추가하고
                }
            } else {                                    // flag가 false 라면
                for (int j = 0; j < arr[i]; j++) {      // x에서
                    x.remove(x.size() - 1);             // 마지막 요소를 제거
                }
            }
        }
        int[] result = new int[x.size()];       // 리스트를 다시 배열 형태로 바꿔야함
        for (int i = 0; i < x.size(); i++) {
            result[i] = x.get(i);
        }
        
        return result;
    }
}
