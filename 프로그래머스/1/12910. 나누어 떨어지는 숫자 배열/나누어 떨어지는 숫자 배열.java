import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++){
            if(arr[i] % divisor ==0){
                list.add(arr[i]);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }   // 비어있으면 -1
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}