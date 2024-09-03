import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length - 1;
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        
        if (num_list[last] > num_list[last - 1]) {
            result[last + 1] = num_list[last] - num_list[last - 1];
        } else {
            result[last + 1] = num_list[last] * 2;
        }
        
        return result;
    }
}
