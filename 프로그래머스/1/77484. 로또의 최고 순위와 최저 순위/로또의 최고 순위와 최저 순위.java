import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int maxRank = Math.min(7 - (matchCount + zeroCount), 6); 
        int minRank = Math.min(7 - matchCount, 6); 

        return new int[] {maxRank, minRank};
    }
}
