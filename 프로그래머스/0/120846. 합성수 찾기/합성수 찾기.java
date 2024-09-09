import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> numList = new ArrayList<>();
        
        for(int i=1; i<=n ; i++) {
            int count =0;
            for(int j=1; j<=n ; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if (count > 2) {
                numList.add(i);
            }
        }
        answer = numList.size();
        
        return answer;
    }
}