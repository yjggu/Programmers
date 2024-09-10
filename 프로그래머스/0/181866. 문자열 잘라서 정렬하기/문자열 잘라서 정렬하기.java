import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {

        List<String> list = new ArrayList<>();
        String[] parts = myString.split("x");
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }
        
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result);
        
        return result;
    }
}
