import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=start_num; i>=end_num; i--) {
            list.add(i);
        }
        
        int length = start_num - end_num + 1;
        int[] result = new int[length];
        
        for(int i=0; i<length ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}