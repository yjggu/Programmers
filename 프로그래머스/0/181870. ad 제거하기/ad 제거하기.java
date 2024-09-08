import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                result.add(strArr[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}