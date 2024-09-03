import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result_list = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i+=n){
            result_list.add(num_list[i]);
        }
        
        int[] answer = new int[result_list.size()];
        
        for(int i=0; i<result_list.size(); i++) {
            answer[i] = result_list.get(i);
        }
        
        return answer;
    }
}