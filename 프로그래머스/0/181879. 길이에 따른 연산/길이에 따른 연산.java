class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int sum = 0;
        int multiple = 1;
        
        if(length>=11){
            for(int i=0;i<length;i++){
                sum += num_list[i];
            }
            return sum;
        } else {
            for(int i=0; i<length;i++) {
                multiple *= num_list[i];
            }
            return multiple;
        }
    }
}


// import java.util.stream.IntStream;

// class Solution {
//     public int solution(int[] num_list) {
//         IntStream stream = IntStream.of(num_list);
//         return num_list.length > 10 ? stream.sum() : stream.reduce(1, (a, b) -> a * b);
//     }
// }