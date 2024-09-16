import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


class Solution {
    public int[] solution(int[] emergency) {
        
        List<int[]> idxList = new ArrayList<>();
        for(int i=0; i<emergency.length; i++) {
            idxList.add(new int[] {emergency[i], i});    // [값, 인덱스 형태로 저장]
        }
        
        idxList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                return b[0] - a[0];
            }
        });
        
        int[] result = new int[emergency.length];
        for(int i=0; i<idxList.size(); i++) {
            int originIdx = idxList.get(i)[1];
            result [originIdx] = i+1;
        }
        
        return result;
    }
}