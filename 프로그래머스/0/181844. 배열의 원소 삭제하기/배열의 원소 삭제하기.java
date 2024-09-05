import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();   // 삭제항목 담을 곳
        for(int del : delete_list) {
            deleteSet.add(del);
        }
        
        ArrayList<Integer> resultList = new ArrayList<>();  // 결과항목 담을 곳
        for(int num : arr) {
            if(!deleteSet.contains(num)) {  // 삭제리스트에 num이 없으면
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
