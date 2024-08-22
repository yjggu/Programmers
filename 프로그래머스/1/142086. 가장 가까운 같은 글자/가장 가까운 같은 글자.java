import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        // 각 문자의 마지막 위치를 저장하는 해시맵

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastSeen.containsKey(ch)) {
                result[i] = i - lastSeen.get(ch);
            } else {
                result[i] = -1;
            }

            lastSeen.put(ch, i);
        }

        return result;
    }
}
