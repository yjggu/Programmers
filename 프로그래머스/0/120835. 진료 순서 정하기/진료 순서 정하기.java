import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {

        int[] sortedEmergency = emergency.clone();
        
        Arrays.sort(sortedEmergency);
        
        for (int i = 0; i < sortedEmergency.length / 2; i++) {
            int temp = sortedEmergency[i];
            sortedEmergency[i] = sortedEmergency[sortedEmergency.length - 1 - i];
            sortedEmergency[sortedEmergency.length - 1 - i] = temp;
        }

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedEmergency.length; i++) {
            rankMap.put(sortedEmergency[i], i + 1); 
        }

        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]); 
        }

        return result;
    }
}
