import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
       for(int num : arr) {
            for(int i = 0; i < num; i++) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}